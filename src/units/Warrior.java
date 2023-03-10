package units;

public abstract class Warrior extends Human {
    String name;
    public Warrior(int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, String name) {
        super(hp, maxHp, minDmg, maxDmg, attack, armor, speed);
        this.name = name;
    }
}
