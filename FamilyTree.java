package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;

public class FamilyTree<T extends Human> implements Iterable<T> {

    private ArrayList<T> treeHuman;
    private ArrayList<T> children;

    // Здесь я создаю два листа в которые вношу полный список людей и еще один
    // список чисто с детьми
    public FamilyTree() {
        treeHuman = new ArrayList<>();
        children = new ArrayList<>();
    }

    // Пока этот метод не нужен, но так как я хочу попробовать добавлять людей с
    // консоли, то он может пригодиться
    // public void addHuman(T human) {
    // treeHuman.add(human);
    // }

    // Данный метод занимаетя сохранением людей в основной лист
    public ArrayList<T> addHuman(T human) {
        treeHuman.add(human);
        return treeHuman;
    }

    // Метод, который сохраняет первоначальный список
    public ArrayList<T> myHuman(T human) {
        Human h1 = new Human(1, "Мария", 55);
        treeHuman.add((T) h1);
        Human h2 = new Human(2, "Валерий", 58);
        treeHuman.add((T) h2);
        Human h3 = new Human(3, "Дмитрий", 30, h2, h1);
        treeHuman.add((T) h3);
        Human h4 = new Human(4, "Дарья", 35);
        treeHuman.add((T) h4);
        Human h5 = new Human(5, "София", 10, h3, h4, h2, h1);
        treeHuman.add((T) h5);
        return treeHuman;
    }

    // Пока это только идея для ввода новых людей
    // public ArrayList<T> addNewHuman(T human) {
    // // Human human = new Human();
    // human.setIndex(scan.nextInt());
    // human.setName(scan.nextLine());
    // human.setAge(scan.nextInt());;
    // treeHuman.add(human);
    // scan.close();
    // return treeHuman;
    // }

    // Этот метод занимается сохранением детей в лист с детьми
    public void addCild(T child) {
        children.add(child);
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator<T>(treeHuman);
    }

    // Так как лист приватныей, то для их чтения нужн get
    public ArrayList<T> getTreeHuman() {
        return treeHuman;
    }
    
    public void setTreeHuman(ArrayList<T> treeHuman) {
        this.treeHuman = treeHuman;
    }

    // Так как лист приватныей, то для их чтения нужн get
    public ArrayList<T> getChildren() {
        return children;
    }
}
