package units;

import java.util.ArrayList;

public class Robber extends Warrior {
    protected int x, y;
    public Robber (String name, int x, int y, int side) {
        super(x, y,10, 10, 2, 4, 8, 3, 6, name, side);
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
        return builder.append("Бандит: \t").append(Robber.super.name)
                .append("\t| ATK:\t").append(Robber.super.attack)
                .append("\t| HP:\t").append(Robber.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Robber.super.coord.getX()).append(".").append(Robber.super.coord.getY());
    }

}
