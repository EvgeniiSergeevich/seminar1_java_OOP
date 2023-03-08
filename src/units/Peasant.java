package units;

public class Peasant extends Human {              //Крестьянин
    String name;
    public Peasant(String name) {
        super(100, 100, 10, 0, 3);
        this.name = name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я крестьянин";
    }
}
