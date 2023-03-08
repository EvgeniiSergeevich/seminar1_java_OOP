import units.*;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        ArrayList<Human> list1 = new ArrayList<>();
        list1.add(new Sniper("Женя"));
        list1.add(new Witch("Коля"));
        list1.add(new Robber("Вася"));
        list1.add(new Crossbowman("Петя"));
        list1.add(new Crossbowman("Толя"));
        list1.add(new Sniper("Саша"));
        list1.add(new Monastic("Игорь"));
        list1.add(new Peasant("Ваня"));
        list1.add(new Spearman("Костя"));
        list1.add(new Spearman("Вадик"));
        list1.forEach(n -> System.out.println(n.getInfo()));
    }
}
