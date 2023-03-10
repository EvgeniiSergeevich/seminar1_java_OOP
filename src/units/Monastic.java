package units;

public class Monastic extends Mag {
    public Monastic(String name) {
        super(30, 30, -4, -4, 12, 7, 1, 1, 5, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я монах " + name + " " + speed;
    }
}
