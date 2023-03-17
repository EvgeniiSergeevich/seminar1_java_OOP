package units;

public abstract class Warrior extends Human {
    String name;
    public Warrior(int x, int y, int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, String name, int side) {
        super(name, x, y, hp, maxHp, minDmg, maxDmg, attack, armor, speed, side);
        this.name = name;
    }
}
