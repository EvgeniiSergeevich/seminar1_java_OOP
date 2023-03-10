package units;

import java.util.Random;

public class Sniper extends Archer {

//    int d = getDmg();
    public Sniper (String name) {
        super(15, 15,8, 10, 12, 9, 32, 32, 32, name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я снайпер " + name;
    }
}
