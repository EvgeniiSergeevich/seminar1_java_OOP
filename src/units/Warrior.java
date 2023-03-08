package units;

public abstract class Warrior extends Human {
    String name;
    public Warrior(int hp, int maxHp, int dmg, int armor, int range, String name) {
        super(hp, dmg, maxHp, armor, range);
        this.name = name;
    }
}
