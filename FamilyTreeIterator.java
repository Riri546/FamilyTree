package FamilyTree;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator implements Iterator<Human> {

    private int index;
    private List<Human> treeHuman;

    public FamilyTreeIterator (List<Human> treeHuman) {
            this.treeHuman = treeHuman;
        }

    @Override
    public boolean hasNext() {
        return index < treeHuman.size();
    }

    @Override
    public Human next() {
        return treeHuman.get(index++);
    }
}
