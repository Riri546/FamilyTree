package FamilyTree;

import java.util.Collections;

public class Service<T extends Human> {

    private FamilyTree<T> tree;

    public Service(FamilyTree<T> tree) {
        this.tree = tree;
    }

    public void sortByName() {
        Collections.sort(tree.getTreeHuman());
    }

    public void sortByAge() {
    Collections.sort(tree.getTreeHuman(), new HumanComparatorByAge<T>());
    }
}
