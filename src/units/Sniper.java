package units;

import java.util.Random;

public class Sniper extends Archer {
    protected int x, y;

//    int d = getDmg();
    public Sniper (String name, int x, int y, int side) {
        super(x, y,15, 15,8, 10, 12, 9, 9, 32, 32, name, side);
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
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append(" \t| Arrows:").append(Sniper.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coord.getX()).append(".").append(Sniper.super.coord.getY());
    }
}
