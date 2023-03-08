package units;

public class Spearman extends Warrior {
    public Spearman(String name) {
        super(130, 130, 50, 35, 5, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }
}
