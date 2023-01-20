package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
// import java.util.List;
import java.util.Scanner;

public class FamilyTree<T extends Human> implements Iterable<T> {
    Scanner scan = new Scanner(System.in);
    private ArrayList<T> treeHuman;
    private ArrayList<T> children;

    public FamilyTree() { 
        treeHuman = new ArrayList<>();
        children = new ArrayList<>();
    }

    public void addHuman(T human) {
        // Human human = new Human();
        human.setIndex(scan.nextInt());
        human.setName(scan.nextLine());
        human.setAge(scan.nextInt());;
        treeHuman.add(human);
    }
    
    // public void viewingList(T human, int index){
    //     ((List<T>) human).get(index);
    // }

    public void addCild(T child){
        children.add(child);
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator<T>(treeHuman);
    }


    public ArrayList<T> getTreeHuman() {
        return treeHuman;
    }

    public ArrayList<T> getChildren() {
        return children;
    }
}
