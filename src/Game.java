import units.*;

public class Game {
    public static void main(String[] args) {
        Peasant player1 = new Peasant("name1", "human");
//        System.out.println(player1.attack());
        Crossbowman player2 = new Crossbowman("name2", "Archer", 100, 30, 30, 100);
        Monastic player3 = new Monastic("name3", "Mag", 90, 20, 10, 50);
        Robber player4 = new Robber("name4", "Warrior", 100, 40, 40, 10);
        Sniper player5 = new Sniper("name5", "Archer", 90, 40, 20, 110);
        Spearman player6 = new Spearman("name6", "Warrior", 100, 40, 40, 10);
        Witch player7 = new Witch("name7", "Mag", 90, 20, 10, 50);
    }
}
