package FamilyTree;

import java.util.Collections;

public class Service {

    private FamilyTree<Human> tree;

    public Service(FamilyTree<Human> tree) {
        this.tree = tree;
    }

    public void sortByName() {
        Collections.sort(tree.getTreeHuman());
    }

    public void sortByAge() {
        Collections.sort(tree.getTreeHuman(), new HumanComparatorByAge<Human>());
    }
}
