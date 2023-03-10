package units;

public class Robber extends Warrior {
    public Robber (String name) {
        super(10, 10, 2, 4, 8, 3, 6, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я разбойник " + name;
    }
}
