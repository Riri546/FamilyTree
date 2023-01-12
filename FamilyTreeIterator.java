package FamilyTree;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator<T extends Human> implements Iterator<T> {

    private int index;
    private List<T> treeHuman;

    public FamilyTreeIterator(List<T> treeHuman) {
        this.treeHuman = treeHuman;
    }

    @Override
    public boolean hasNext() {
        return index < treeHuman.size();
    }

    @Override
    public T next() {
        return treeHuman.get(index++);
    }
}
