package FamilyTree;

import java.util.Collections;

public class Service {

    private FamilyTree<Human> tree;

    public Service(FamilyTree<Human> tree) {
        this.tree = tree;
    }

    // Метод для сортировки по имени
    public void sortByName() {
        Collections.sort(tree.getTreeHuman());
    }

    // Метод для сортировки по возрасту
    public void sortByAge() {
        Collections.sort(tree.getTreeHuman(), new HumanComparatorByAge<Human>());
    }
}
