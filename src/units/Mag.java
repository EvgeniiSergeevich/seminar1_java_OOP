package units;

import java.util.ArrayList;

public abstract class Mag extends Human {
    int mana, maxMana;
    String name;

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public Mag(int x, int y, int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int mana, int maxMana, int speed, String name, int side) {
        super(name, x, y, hp, maxHp, minDmg, maxDmg, attack, armor, speed, side);
        this.mana = mana;
        this.maxMana = maxMana;
        this.name = name;
    }
    public void step(ArrayList<Human> team1, ArrayList<Human> team2)
    {
        if (state.equals("Die")) return;
        Human target = findLowHP(team1);
        target.getDamage(minDmg);
        mana--;
    }

    protected Human findLowHP(ArrayList<Human> team)
    {
        int index = 0;
        double minHp = Double.MAX_VALUE;
        for (int i = 0; i < team.size(); i++)
        {
            if (minHp > team.get(i).maxHp - team.get(i).getHp())
            {
                index = i;
                minHp = team.get(i).maxHp - team.get(i).getHp();
            }
        }
        return team.get(index);
    }

}
