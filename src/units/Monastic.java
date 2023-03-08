package units;

public class Monastic extends Mag {
    public Monastic(String name) {
        super(100,100, 40, 5, 20, 100, 100, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я монах";
    }
}
