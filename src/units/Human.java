package units;

import java.util.ArrayList;

public abstract class Human implements GameInterface {

    protected int maxHp, minDmg, maxDmg, damage, attack, armor, speed, side;
    protected float hp;
    protected Coords coord;
    protected String state, name;

    public int[] getCoords() { return new int[]{coord.getX(), coord.getY()}; }
    public float getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMinDmg() {
        return minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSide() {
        return side;
    }

    public void getDamage(double damage) {
        this.hp -= damage;
        if (hp < 0) {
            hp = 0;
            state = "Dead";
        }
        if(hp > maxHp) hp = maxHp;
    }
    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + armor +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDmg+maxDmg)/2)) +
                " " + state;
    }

    public Human (String name, int x, int y, float hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, int side){
        coord = new Coords(x, y);
        this.hp = hp;
        this.maxHp = maxHp;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.attack = attack;
        this.armor = armor;
        this.speed = speed;
        this.side = side;
        state = "Stand";
        this.name = name;
    }

    protected int findNearest(ArrayList<Human> team)
    {
        int index = 0;
        double min = 100;
        for (int i = 0; i < team.size(); i++) {
            if(min > coord.distance(team.get(i).coord) && !team.get(i).state.equals("Die"))
            {
                index = i;
                min = coord.distance(team.get(i).coord);
            }
        }
        return index;
    }

    public abstract void step(ArrayList<Human> red, ArrayList<Human> blue);
}
