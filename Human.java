package FamilyTree;

// import java.util.ArrayList;
import java.util.List;

public class Human {

    private String name;
    private int age;
    private Human father;
    private Human mather;
    private List<Human> children;

    public Human(String name, int age, Human father, Human mather) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mather = mather;
        father.children.add(this);
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Имя: " + name + " Возрост: " + age + " Отец: " + father + " Мать: " + mather;
    }

    // private ArrayList<Communications> family = new ArrayList<Communications>();

    // public Human(String name) {
    // this.name = name;
    // }

    // public Human(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    // public Human(String name, int age, ArrayList<Communications> family) {
    // this.name = name;
    // this.age = age;
    // // this.family = family;
    // }

    // public void toString(String st) {
    // ArrayList<Communications> tList = this.getFamily();
    // System.out.println("Родственники степени: " + st + ", для " + this.name + ":
    // ");
    // for (int i = 0; i < tList.size(); i++) {
    // if (tList.get(i).getH2() != this && tList.get(i).getDegreeKinship2() == st) {
    // System.out.println("Имя: " + tList.get(i).getH2().name + ", ");
    // System.out.println("Возрваст: " + tList.get(i).getH2().age + ", ");
    // System.out.println("Степень родства: " + tList.get(i).getDegreeKinship2() +
    // ".");
    // }
    // }
    // }

    // public void addCommunications(Human h2, String st1, String st2) {
    // this.family.add(new Communications(this, h2, "Дети", "Родители"));
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMather() {
        return mather;
    }

    public void setMather(Human mather) {
        this.mather = mather;
    }

    // public ArrayList<Communications> getFamily() {
    // return family;
    // }
}
