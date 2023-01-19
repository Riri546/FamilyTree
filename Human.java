package FamilyTree;

public class Human implements Comparable<Human> {
    private int index;
    private String name;
    private int age;
    private Human father;
    private Human mather;
    private Human grandfather;
    private Human grandmather;
    FamilyTree<Human> tree = new FamilyTree<>();

    public Human(int index, String name, int age) {
        this.index = index;
        this.name = name;
        this.age = age;
    }

    public Human(int index, String name, int age, Human father, Human mather) {
        this.index = index;
        this.name = name;
        this.age = age;
        this.father = father;
        this.mather = mather;

        if (father != null) {
            father.tree.addCild(this);
        }
        if (mather != null) {
            mather.tree.addCild(this);
        }
    }

    public Human(int index, String name, int age, Human father, Human mather, Human grandfather, Human grandmather) {
        this.index = index;
        this.name = name;
        this.age = age;
        this.father = father;
        this.mather = mather;
        this.grandfather = grandfather;
        this.grandmather = grandmather;
    }

    @Override
    public String toString() {
        if (father == null & mather == null) {
            return "№" + this.index + ". " + this.name + " - " + this.age + " лет.";
        }
        if (grandfather == null & grandmather == null) {
            return "№" + this.index + ". " + this.name + " - " + this.age + " лет: " + "\n" + " Отец: "
                    + this.father.name + "\n"
                    + " Мать: " + this.mather.name;
        } else {
            return "№" + this.index + ". " + this.name + " - " + this.age + " лет: " + "\n" 
            + " Отец: " + this.father.name + "\n" 
            + " Мать: " + this.mather.name + "\n" 
            + " Дедушка: " + this.grandfather.name + "\n" 
            + " Бабушка: " + this.grandmather.name;
        }
    }

    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.getName());
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
