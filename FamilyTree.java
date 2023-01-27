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
    
    //Данный метод занимаетя сохранением людей в основной лист 
    // public void addHuman(T human) {
    //     treeHuman.add(human);
    // }
    public void addHuman(T human){
        treeHuman.add(human);
    }

    public void myHuman(T human){
        // Human h1 = new Human(1, "Мария", 55);
        // treeHuman.add(h1);
        // Human h2 = new Human(2, "Валерий", 58);
        // tree.addHuman(h2);
        // Human h3 = new Human(3, "Дмитрий", 30, h2, h1);
        // tree.addHuman(h3);
        // Human h4 = new Human(4, "Дарья", 35);
        // tree.addHuman(h4);
        // Human h5 = new Human(5, "София", 10, h3, h4, h2, h1);
        // tree.addHuman(h5);
    }

    // public void addHuman(T human) {
    // // Human human = new Human();
    // human.setIndex(scan.nextInt());
    // human.setName(scan.nextLine());
    // human.setAge(scan.nextInt());;
    // treeHuman.add(human);
    // scan.close();
    // }

    // public void viewingList(T human, int index){
    // ((List<T>) human).get(index);
    // }

    //Этот метод занимается сохранением детей в лист с детьми 
    public void addCild(T child) {
        children.add(child);
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator<T>(treeHuman);
    }

    //Так как лист приватныей, то для их чтения нужн get 
    public ArrayList<T> getTreeHuman() {
        return treeHuman;
    }

    //Так как лист приватныей, то для их чтения нужн get 
    public ArrayList<T> getChildren() {
        return children;
    }
}
