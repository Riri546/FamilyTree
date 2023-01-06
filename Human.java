package FamilyTree;

import java.util.ArrayList;

public class Human {

    private String name;
    private int age;
    private ArrayList<Communications> family = new ArrayList<Communications>();

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

    public void printRelatives(String st) {
        ArrayList<Communications> tList = this.getFamily();
        System.out.println("родственники степени: " + st + ", для " + this.name + ": ");
        for (int i = 0; i < tList.size(); i++) {
            if (tList.get(i).getH2() != this && tList.get(i).getDegreeKinship2() == st) {
                System.out.println("Имя: " + tList.get(i).getH2().name + ", ");
                System.out.println("Возрваст: " + tList.get(i).getH2().age + ", ");
                System.out.println("Степень родства: " + tList.get(i).getDegreeKinship2() + ".");
            }
        }
    }

    public void addCommunications(Human h2, String st1, String st2) {
        this.family.add(new Communications(this, h2, "Дети", "Родители"));
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public ArrayList<Communications> getFamily() {
        return family;
    }
}
