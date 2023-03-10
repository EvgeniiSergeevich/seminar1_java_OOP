import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        ArrayList<Human> list1 = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    list1.add(new Peasant(getName()));
                    break;
                case 1:
                    list1.add(new Robber(getName()));
                    break;
                case 2:
                    list1.add(new Spearman(getName()));
                    break;
                case 3:
                    list1.add(new Crossbowman(getName()));
                    break;
                case 4:
                    list1.add(new Sniper(getName()));
                    break;
                case 5:
                    list1.add(new Monastic(getName()));
                    break;
                case 6:
                    list1.add(new Witch(getName()));
                    break;
            }
        }
        list1.forEach(n -> System.out.println(n.getInfo()));
    }

    private static String getName()
    {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }



}
