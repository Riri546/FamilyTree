package FamilyTree;

import java.util.Comparator;

public class HumanComparatorByAge<T extends Human> implements Comparator<T> {

    //Метод для сортировки по возрасту
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
