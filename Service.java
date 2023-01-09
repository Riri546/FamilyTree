package FamilyTree;

import java.util.Collections;

public class Service {

    private FamilyTree family;

    public Service(FamilyTree family) {
        this.family = family;
    }

    public void addHuman(String name, int age) {
        Human human = new Human(name, age);
        family.addHuman(human);
    }

    // public void sortByName() {
    //     Collections.sort(family.getTreeHuman());
    // }

    // public void sortById() {
    // Collections.sort(group.getStudentList(), new StudentComparatorById());
    // }
}
