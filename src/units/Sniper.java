package units;

public class Sniper extends Archer {
    public Sniper (String name) {
        super(120, 120, 35, 5, 40, 11, 11, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я снайпер " + name;
    }
}
