package FamilyTree;

import java.util.ArrayList;

public class FamilyTree {

    ArrayList<Human> treeHuman = new ArrayList<Human>();

    public void preOrder(Human tree, String spase){
        if(tree != null)
        System.out.println(spase + tree.getName());
        else{
            System.out.println(spase + "nil");
            return;
        }

        for(int i = 0; i < tree.getFamily().size(); i++){
            preOrder(tree.getFamily().get(i).getH2(), spase + "");
        }

        // for(int i = 0; i < tree.family.size(); i++){
        //     preOrder(tree.family.get(i).getH2(), spase + " ");
        // }
    }
    
    // public FamilyTree(List<Human> personList) {
    //    this.personList = personList;
    // }
    


}


