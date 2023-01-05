package FamilyTree;

import java.util.List;

public class Human {

    private String name;
    private int age;
    private Human father;
    private List<Human> childrenList;
    
    public Human(String name, int age, Human father) {
        this.name = name;
        this.age = age;
        this.father = father;
        father.childrenList.add(this);
    }
    
    public String getName() {
        return name;
    }
    
    public double getAge() {
        return age;
    }

    public Human getFather(){
        return father;
    }
    
    @Override
    public String toString() {
        return name + ": " + age + " " + father + " ";
    }
}

  
