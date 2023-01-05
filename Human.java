package FamilyTree;

import java.util.List;

public class Human {

    private String name;
    private int age;
    private Human father;
    private Human mather;
    private List<Human> childrenList;
    
    public Human(String name, int age, Human father, Human mather) {
        this.name = name;
        this.age = age;
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

  
