package FamilyTree;

import java.util.List;

public class Human {
    String name;
    Human father;
    Human mather;
    Human Grandma;
    Human Grandpa;
    List<Human> children;

    public Human(String name, Human father){
        this.name = name;
        this.father = father;
        father.children.add(this);

    }

}
