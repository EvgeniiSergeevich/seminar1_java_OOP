package units;

public class Peasant extends Human {              //Крестьянин
    String name;
    int delivery;
    public Peasant(String name) {
        super(1, 1, 1,1,1,1, 3);
        this.name = name;
        this.delivery = 1;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я крестьянин " + name;
    }
}
