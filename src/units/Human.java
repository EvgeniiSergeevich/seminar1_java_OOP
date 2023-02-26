package units;

public abstract class Human {
    protected String name;
    protected String type;
    protected int hp;
    protected int dmg;
    protected int armor;
    protected int range;

    public int attack()
    {
        hp = hp + armor - dmg;
        return hp;
    }

//    public void damage()
//    {
//
//    }

    public Human (String name, String type, int hp, int dmg, int armor, int range){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.dmg = dmg;
        this.armor = armor;
        this.range = range;
    }

}
