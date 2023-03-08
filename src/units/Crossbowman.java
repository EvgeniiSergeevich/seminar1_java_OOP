package units;

public class Crossbowman extends Archer {
    public Crossbowman(String name) {
        super(120, 120, 30, 8, 30, 15, 15, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я арбалетчик";
    }
}
