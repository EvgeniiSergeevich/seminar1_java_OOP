package units;

import java.util.ArrayList;

public class Peasant extends Human {              //Крестьянин
    protected int x, y, arrows;
    String name;
    int delivery;
    protected Peasant(String name, int x, int y, float hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed, int side, int arrows) {
        super(name, x, y, hp, maxHp, minDmg, maxDmg, attack, armor, speed, side);
        this.x = x;
        this.y = y;
        this.name = name;
        this.delivery = 1;
        this.arrows = arrows;
    }
    public Peasant(String name, int x, int y, int side) {
        super(name, x, y, 50.f, 50, 1, 1, 1, 1, 3, side);
        this.arrows = 100;
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
        return builder.append("Фермер: \t").append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.attack)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append(" \t| Arrows: ").append(Peasant.this.arrows)
                .append("\t|").append("\t State ").append(this.state.toString())
                .append("\t| ( X.Y) : ").append(Peasant.super.coord.getX()).append(".").append(Peasant.super.coord.getY());
    }

    @Override
    public void step(ArrayList<Human> red, ArrayList<Human> blue) {
        if (!state.equals("Dead")) state = "Stand";
    }
}
