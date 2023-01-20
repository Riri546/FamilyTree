package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
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
        treeHuman.add(human);
        // while (scan.hasNextLine()) {
        //     treeHuman.add(scan.nextLine());
        // }
        

    }
    public void add(){
        Human h1 = new Human(1, "Мария", 55);
        addHuman(h1);
        Human h2 = new Human(2, "Валерий", 58);
        addHuman(h2);
        Human h3 = new Human(3, "Дмитрий", 30, h2, h1);
        tree.addHuman(h3);
        Human h4 = new Human(4, "Дарья", 35);
        tree.addHuman(h4);
        Human h5 = new Human(5, "София", 10, h3, h4, h2, h1);
        tree.addHuman(h5);
    }

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
