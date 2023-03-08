package units;

public abstract class Human implements GameInterface {

    protected int hp, maxHp, dmg, armor, range;


    public int getHp() {
        return hp;
    }

//    public int attack()
//    {
//        hp = hp + armor - dmg;
//        return hp;
//    }

    public Human (int hp, int maxHp, int dmg, int armor, int range){

        this.hp = hp;
        this.dmg = dmg;
        this.armor = armor;
        this.range = range;
    }

}
