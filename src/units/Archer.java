package units;

public abstract class Archer extends Human {
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

    public Archer(int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, int maxShots, int shots, String name) {
        super(hp, maxHp, minDmg, maxDmg, attack, armor, speed);
        this.maxShots = maxShots;
        this.shots = shots;
        this.name = name;
    }
}
