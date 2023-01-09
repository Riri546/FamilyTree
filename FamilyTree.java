package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Human> {
    private ArrayList<Human> treeHuman;

    public FamilyTree(){
        treeHuman = new ArrayList<>();
    }

    public void addHuman(Human human) {
        treeHuman.add(human);
    }
    
    // @Override
    // public Iterator<Human> iterator() {
    //     return new StudyGroupIterator(treeHuman);
    // }
    
    // public List<Human> getTreeHuman() {
    //     return treeHuman;
    // }


    

    // public void preOrder(Human tree, String spase) {
    //     if (tree != null)
    //         System.out.println(spase + tree.getName());
    //     else {
    //         System.out.println(spase + "nil");
    //         return;
    //     }

    //     for (int i = 0; i < tree.getFamily().size(); i++) {
    //         preOrder(tree.getFamily().get(i).getH2(), spase + "");
    //     }
    // }
}
