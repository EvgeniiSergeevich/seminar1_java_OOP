package units;

public abstract class Mag extends Human {
    int mana, maxMana;
    String name;

    public Mag(int hp, int maxHp, int dmg, int armor, int range, int mana, int maxMana, String name) {
        super(hp, dmg, maxHp, armor, range);
        this.mana = mana;
        this.maxMana = maxMana;
        this.name = name;
    }
}
