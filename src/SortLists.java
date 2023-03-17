import units.Human;

import java.util.ArrayList;
import java.util.Comparator;

public class SortLists {
    static ArrayList<Human> toSort(ArrayList<Human> list)
    {
        list.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHp() - o1.getHp());
                else return (int) o2.getSpeed() - o1.getSpeed();
            }
        });
        return list;
    }
}
