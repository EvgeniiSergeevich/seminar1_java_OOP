package units;

public class Peasant extends Human {              //Крестьянин
    String name;
    public Peasant(String name) {
        super(100, 100, 10, 0, 3);
        this.name = name;
    }

}
