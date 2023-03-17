import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        ArrayList<Human> list1 = new ArrayList<>();

        ArrayList<Human> red = new ArrayList<>();
        ArrayList<Human> blue = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String stop = "";
        int x = 0;
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    red.add(new Peasant(getName(), x, 0, 1));
                    break;
                case 1:
                    red.add(new Robber(getName(), x, 0, 1));
                    break;
                case 2:
                    red.add(new Sniper(getName(), x, 0, 1));
                    break;
                case 3:
                    red.add(new Witch(getName(), x, 0,  1));
                    break;
            }
            x++;
        }
        x = 0;
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    blue.add(new Peasant(getName(), x, 9,  2));
                    break;
                case 1:
                    blue.add(new Spearman(getName(), x, 9,  2));
                    break;
                case 2:
                    blue.add(new Crossbowman(getName(), x, 9,  2));
                    break;
                case 3:
                    blue.add(new Monastic(getName(), x, 9,  2));
                    break;
            }
            x++;

        }

        SortLists.toSort(red);
        SortLists.toSort(blue);

        list1.addAll(red);
        list1.addAll(blue);
        SortLists.toSort(list1);



        System.out.println("Красная команда:");
//        red.forEach(n -> n.step());
        red.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\nСиняя команда:");
        blue.forEach(n -> System.out.println(n.getInfo()));
//        blue.forEach(n -> n.step());
        System.out.println("\nВсе команды:");
        list1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();

        while (stop.equals("")) {
            for (Human human : list1) {
                if (red.contains(human)) {
                    human.step(red, blue);
                } else {
                    human.step(blue, red);
                }
                list1.forEach(n -> System.out.println(n.getInfo()));
                stop = sc.nextLine();
            }
        }
    }

    private static String getName()
    {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }



}
