package units;

public class Spearman extends Warrior {
    public Spearman(String name) {
        super(10, 10, 1, 3, 4, 5, 4, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я копейщик " + name;
    }
}
