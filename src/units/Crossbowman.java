package units;

import units.coords.Coords;

public class Crossbowman extends Archer {
    protected int x, y;
    public Crossbowman(String name, int x, int y, int side) {
        super(x,y, 10, 10,2, 3, 6, 3, 4, 16, 16, name, side);
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
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.hp)
                .append(" \t| Arrows:").append(Crossbowman.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.coord.getX()).append(".").append(Crossbowman.super.coord.getY());
    }
}
