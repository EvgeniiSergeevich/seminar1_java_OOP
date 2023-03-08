package units;

public class Witch extends Mag {
    public Witch(String name) {
        super(100,100, 42, 4, 20, 110, 110, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я колдун " + name;
    }
}
