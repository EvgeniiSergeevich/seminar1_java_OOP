package units;

public abstract class Mag extends Human {
    int mana, maxMana;
    String name;

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public Mag(int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int mana, int maxMana, int speed, String name) {
        super(hp, maxHp, minDmg, maxDmg, attack, armor, speed);
        this.mana = mana;
        this.maxMana = maxMana;
        this.name = name;
    }
}
