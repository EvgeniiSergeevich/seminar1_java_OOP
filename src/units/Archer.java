package units;

public abstract class Archer extends Human {
    protected int shots, maxShots;
    protected String name;

    public Archer(int hp, int maxHp, int dmg, int armor, int range, int shots, int maxShots, String name) {
        super(hp, dmg, maxHp, armor, range);
        this.shots = shots;
        this.maxShots = maxShots;
        this.name = name;
    }
}
