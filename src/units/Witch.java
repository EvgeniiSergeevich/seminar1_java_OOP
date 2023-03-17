package units;

public class Witch extends Mag {
    protected int x, y;
    public Witch(String name, int x, int y, int side) {
        super(x, y,30, 30, -5, -5, 17, 12, 1, 1, 9, name, side);
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
        return builder.append("Колдун: \t").append(Witch.super.name)
                .append("\t| ATK:\t").append(Witch.super.attack)
                .append("\t| HP:\t").append(Witch.super.hp)
                .append(" \t| MP:\t").append(Witch.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Witch.super.coord.getX()).append(".").append(Witch.super.coord.getY());
    }
}
