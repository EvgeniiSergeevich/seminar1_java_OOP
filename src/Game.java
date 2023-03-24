import units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static ArrayList<Human> list1 = new ArrayList<>();

    public static ArrayList<Human> green = new ArrayList<>();
    public static ArrayList<Human> blue = new ArrayList<>();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stop = "";
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    green.add(new Peasant(getName(), i+1, 1, 1));
                    break;
                case 1:
                    green.add(new Robber(getName(), i+1, 1, 1));
                    break;
                case 2:
                    green.add(new Sniper(getName(), i+1, 1, 1));
                    break;
                case 3:
                    green.add(new Witch(getName(), i+1, 1,  1));
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    blue.add(new Peasant(getName(), i+1, 10,  2));
                    break;
                case 1:
                    blue.add(new Spearman(getName(), i+1, 10,  2));
                    break;
                case 2:
                    blue.add(new Crossbowman(getName(), i+1, 10,  2));
                    break;
                case 3:
                    blue.add(new Monastic(getName(), i+1, 10,  2));
                    break;
            }
        }

//        SortLists.toSort(green);
//        SortLists.toSort(blue);

        list1.addAll(green);
        list1.addAll(blue);
        SortLists.toSort(list1);

//        System.out.println("Красная команда:");
//        red.forEach(n -> System.out.println(n.getInfo()));
//        System.out.println("\nСиняя команда:");
//        blue.forEach(n -> System.out.println(n.getInfo()));
//        System.out.println("\nВсе команды:");
//        list1.forEach(n -> System.out.println(n.getInfo()));
//        System.out.println();

//        while (stop.equals("")) {
//            for (Human human : list1) {
//                if (red.contains(human)) {
//                    human.step(red, blue);
//                } else {
//                    human.step(blue, red);
//                }
//                list1.forEach(n -> System.out.println(n.getInfo()));
//                stop = sc.nextLine();
//            }
//        }

        while (true){
            View.view();
            sc.nextLine();
            for (Human human: list1) {
                if (blue.contains(human)) human.step(green, blue);
                else human.step(blue, green);
            }
        }
    }

    private static String getName()
    {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }



}
