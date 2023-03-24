package units;


import java.util.ArrayList;

public abstract class Archer extends Human implements GameInterface {
    protected int range, shots;
    protected String name;

    public int getShots() {
        return shots;
    }

    public String getName() {
        return name;
    }



    public Archer(int x, int y, int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, int range, int shots, String name, int side) {
        super(name, x, y, hp, maxHp, minDmg, maxDmg, attack, armor, speed, side);
        this.shots = shots;
        this.name = name;
        this.range = range;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + armor +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDmg+maxDmg)/2)) +
                " Shots:" + shots + " " +
                state;
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
