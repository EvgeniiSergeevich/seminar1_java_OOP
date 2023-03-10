package units;

public class Crossbowman extends Archer {
    public Crossbowman(String name) {
        super(10, 10,2, 3, 6, 3, 4, 16, 16, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я арбалетчик " + name + " " + speed;
    }
}
