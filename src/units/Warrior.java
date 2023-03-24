package units;

import java.util.ArrayList;

public abstract class Warrior extends Human {
    String name;
    public Warrior(int x, int y, int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, String name, int side) {
        super(name, x, y, hp, maxHp, minDmg, maxDmg, attack, armor, speed, side);
        this.name = name;
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die")) return;

        Human victim = team1.get(findNearest(team1));
        if (victim.coord.distance(coord) < 2)
        {
            float damage = (victim.armor - attack)>0 ? minDmg : (victim.armor - attack)<0 ? maxDmg : (minDmg+maxDmg)/2;
            victim.getDamage(damage);
        }
        else
        {
            if (coord.chooseWay(victim.coord).y > 0)
            {
                coord.y--;
            }
            else
            {
                coord.y++;
            }
        }




    }
}
