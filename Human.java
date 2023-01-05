package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Human {

    private String name;
    private int age;
    private ArrayList<Communications> family = new ArrayList<Communications>();
    // private Human father;
    // private Human mather;
    // private List<Human> childrenList;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, ArrayList<Communications> family) {
        this.name = name;
        this.age = age;
        this.family = family;
    }

    public void printRelatives(int st) {
        ArrayList<Communications> tList = this.getFamily();
        System.out.println("родственники степени: " + st + "для " + this.name + ": ");
        for (int i = 0; i < tList.size(); i++) {
            if (tList.get(i).h2 != this && tList.get(i).degreeKinship2 == st) {
                System.out.println("Имя: " + tList.get.h2.name + ", ");
                System.out.println("Возрваст: " + tList.get.h2.age + ", ");
                System.out.println("Степень родства: " + tList.get.degreeKinship2 + ". ");
            }
        }
    }

    public void addCommunications(Human h2, int st1, int st2){
        this.family.add(new Communications(this, h2, 1, 2));
    }
    // public Human(Human father, Human mather){
    // this.father = father;
    // this.mather = mather;
    // mather.childrenList.add(this);
    // father.childrenList.add(this);
    // }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public ArrayList<Communications> getFamily() {
        return family;
    }
    // public Human getFather(){
    // return father;
    // }

    // public Human getMather(){
    // return mather;
    // }

    // @Override
    // public String toString() {
    //     return name + ": " + age + " " + father + " " + mather + " ";
    // }
}
