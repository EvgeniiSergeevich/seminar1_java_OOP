package units;

public class Witch extends Mag {
    public Witch(String name) {
        super(30, 30, -5, -5, 17, 12, 1, 1, 9, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я колдун " + name;
    }
}
