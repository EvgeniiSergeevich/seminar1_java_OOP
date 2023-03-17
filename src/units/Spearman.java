package units;

import java.util.ArrayList;

public class Spearman extends Warrior {
    protected int x, y;
    public Spearman(String name, int x, int y, int side) {
        super(x, y,10, 10, 1, 3, 4, 5, 4, name, side);
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
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coord.getX()).append(".").append(Spearman.super.coord.getY());
    }
    @Override
    public void step(ArrayList<Human> red, ArrayList<Human> blue) {

    }
}
