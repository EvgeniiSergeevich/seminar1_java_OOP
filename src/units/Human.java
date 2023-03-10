package units;

public abstract class Human implements GameInterface {

    protected int hp, maxHp, minDmg, maxDmg, attack, armor, speed;


    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMinDmg() {
        return minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public int getSpeed() {
        return speed;
    }

    public Human (int hp, int maxHp, int minDmg, int maxDmg, int attack, int armor, int speed){

        this.hp = hp;
        this.maxHp = maxHp;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.attack = attack;
        this.armor = armor;
        this.speed = speed;
    }

}
