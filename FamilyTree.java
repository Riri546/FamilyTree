package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends Human> implements Iterable<T> {
    private ArrayList<T> treeHuman;

    public FamilyTree() { 
        treeHuman = new ArrayList<>();
    }

    public void addHuman(Human human) {
        treeHuman.add(human);
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator(treeHuman);
    }

    public List<T> getTreeHuman() {
        return treeHuman;
    }
}
