package units;

import java.util.ArrayList;

public class Monastic extends Mag {
    protected int x, y;
    public Monastic(String name, int x, int y, int side) {
        super(x, y,30, 30, -4, -4, 12, 7, 1, 1, 5, name, side);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    @Override
    public void step() {

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monastic.super.name)
                .append("\t| ATK:\t").append(Monastic.super.attack)
                .append("\t| HP:\t").append(Monastic.super.hp)
                .append(" \t| MP:\t").append(Monastic.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monastic.super.coord.getX()).append(".").append(Monastic.super.coord.getY());
    }
}
