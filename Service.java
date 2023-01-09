package FamilyTree;

import java.util.Collections;

public class Service {

    private FamilyTree tree;

    public Service(FamilyTree tree) {
        this.tree = tree;
    }

    // public void addHuman(String name, int age, Human father, Human mather) {
    // Human human = new Human(name, age, father, mather);
    // tree.addHuman(human);
    // }

    public void sortByName() {
        Collections.sort(tree.getTreeHuman());
    }

    // public void sortById() {
    // Collections.sort(group.getStudentList(), new StudentComparatorById());
    // }
}
