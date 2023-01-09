package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Human> {
    private ArrayList<Human> treeHuman;

    public FamilyTree() {
        treeHuman = new ArrayList<>();
    }

    public void addHuman(Human human) {
        treeHuman.add(human);
    }

    @Override
    public Iterator<Human> iterator() {
    return new FamilyTreeIterator(treeHuman);
    }

    public List<Human> getTreeHuman() {
    return treeHuman;
    }
}
