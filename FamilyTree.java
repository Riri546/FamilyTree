package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends Human> implements Iterable<T> {
    private ArrayList<T> treeHuman;
    private List<Human> children;

    public FamilyTree() { 
        treeHuman = new ArrayList<>();
        children = new ArrayList<>();
    }

    public void addHuman(T human) {
        treeHuman.add(human);
    }

    public void addCild(T child){
        children.add(child);
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator(treeHuman);
    }

    public List<T> getTreeHuman() {
        return treeHuman;
    }
}
