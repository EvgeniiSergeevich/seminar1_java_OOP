package units;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Coords {
    protected int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Coords pointA)
    {
        return  sqrt(pow((x - pointA.x), 2) + pow((y - pointA.y), 2));
    }

//    protected boolean isLeft(Coords oponent){
//        return x < oponent.x;
//    }
//
//    protected  boolean isRight(Coords opponent)
//    {
//        return x > opponent.x;
//    }
//
//    protected boolean isUp(Coords opponent)
//    {
//        return y > opponent.y;
//    }
//
//    protected boolean isDown(Coords opponent)
//    {
//        return y < opponent.y;
//    }

    protected Coords chooseWay(Coords opponent)
    {
        return new Coords(x - opponent.x,y - opponent.y);
    }


}
