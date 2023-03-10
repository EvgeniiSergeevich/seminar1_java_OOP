import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        ArrayList<Human> list1 = new ArrayList<>();

        ArrayList<Human> red = new ArrayList<>();
        ArrayList<Human> blue = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    red.add(new Peasant(getName()));
                    break;
                case 1:
                    red.add(new Robber(getName()));
                    break;
                case 2:
                    red.add(new Sniper(getName()));
                    break;
                case 3:
                    red.add(new Witch(getName()));
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    blue.add(new Peasant(getName()));
                    break;
                case 1:
                    blue.add(new Spearman(getName()));
                    break;
                case 2:
                    blue.add(new Crossbowman(getName()));
                    break;
                case 3:
                    blue.add(new Monastic(getName()));
                    break;
            }
        }


//        for (int i = 0; i < 9; i++) {
//            switch (new Random().nextInt(6)) {
//                case 0:
//                    list1.add(new Peasant(getName()));
//                    break;
//                case 1:
//                    list1.add(new Robber(getName()));
//                    break;
//                case 2:
//                    list1.add(new Spearman(getName()));
//                    break;
//                case 3:
//                    list1.add(new Crossbowman(getName()));
//                    break;
//                case 4:
//                    list1.add(new Sniper(getName()));
//                    break;
//                case 5:
//                    list1.add(new Monastic(getName()));
//                    break;
//                case 6:
//                    list1.add(new Witch(getName()));
//                    break;
//            }
//        }

        red.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        blue.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        list1.addAll(red);
        list1.addAll(blue);
        list1.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        System.out.println("Красная команда:");
        red.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\nСиняя команда:");
        blue.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\nВсе команды:");
        list1.forEach(n -> System.out.println(n.getInfo()));
    }

    private static String getName()
    {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }



}
