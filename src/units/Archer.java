package units;


import units.coords.Coords;

import java.util.ArrayList;

public abstract class Archer extends Human implements GameInterface {
    protected int shots, maxShots;
    protected String name;

    public int getShots() {
        return shots;
    }

    public String getName() {
        return name;
    }

    public int getMaxShots() {
        return maxShots;
    }

    public Archer(int x, int y, int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, int maxShots, int shots, String name, int side) {
        super(name, x, y, hp, maxHp, minDmg, maxDmg, attack, armor, speed, side);
        this.maxShots = maxShots;
        this.shots = shots;
        this.name = name;
    }

    public void step(ArrayList<Human> team1, ArrayList<Human> team2)
    {
        if (getShots() == 0 && state.equals("Dead")) return;
        Human target = team1.get(findNearest(team2));
        float damage = (target.armor - attack) > 0 ? minDmg : (target.armor - attack) < 0 ? maxDmg : (minDmg + maxDmg) / 2;
        target.getDamage(damage);
        for (Human human : team1)
        {
            if (human instanceof Peasant && human.state.equals("Stand"))
            {
                human.state = "Busy";
                return;
            }
        }
        shots--;
    }



}
