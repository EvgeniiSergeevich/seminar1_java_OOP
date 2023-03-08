package units;

public class Robber extends Warrior {
    public Robber (String name) {
        super(130, 130, 55, 39, 3, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я разбойник " + name;
    }
}
