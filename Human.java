package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Human {

    private String name;
    private int age;
    private Human father;
    private Human mather;
    private List<Human> childrenList = new ArrayList<>();
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human father, Human mather){
        this.father = father;
        this.mather = mather;
        mather.childrenList.add(this);
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

    public Human getMather(){
        return mather;
    }
    
    @Override
    public String toString() {
        return name + ": " + age + " " + father + " " + mather + " ";
    }
}

  
