package FamilyTree;

// import java.util.ArrayList;
import java.util.List;

public class Human implements Comparable<Human> {

    private String name;
    private int age;
    private Human father;
    private Human mather;
    private Human grandfather;
    private Human grandmather;
    private List<Human> children;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, Human father, Human mather) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mather = mather;
        // if (father != null) {
        // father.children.add(this);
        // }
        // if (mather != null) {
        // mather.children.add(this);
        // }
    }

    @Override
    public String toString() {
        if (father == null & mather == null) {
            return " " + name + " " + age;
        } else {
            return " " + name + " " + age + " Отец: " + father + " Мать: " + mather;
        }
    }

    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.getName());
    }

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

    public Human getGrandfather() {
        return grandfather;
    }

    public void setGrandfather(Human grandfather) {
        this.grandfather = grandfather;
    }

    public Human getGrandmather() {
        return grandmather;
    }

    public void setGrandmather(Human grandmather) {
        this.grandmather = grandmather;
    }
}
