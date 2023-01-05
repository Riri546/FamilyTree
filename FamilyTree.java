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
            preOrder(tree.getFamily().get(i).getH2(), spase + " ");
        }

        // for(int i = 0; i < tree.family.size(); i++){
        //     preOrder(tree.family.get(i).getH2(), spase + " ");
        // }
    }
    
    // public FamilyTree(List<Human> personList) {
    //    this.personList = personList;
    // }
    
    // public FamilyTree() {
    //     this(new ArrayList<>());
    // }
    
    // //*Для того что бы моно было читать инфо из приватной переменной, а точнее в листе*/
    // public List<Human> getPersonList() {
    //     return personList;
    // }

    // //*Для того что бы модно было изменять данные в приватной переменной, а точнее в листе */
    // public void setProductList(List<Human> personList) {
    //     this.personList = personList;
    // }

    // //*Для сохранения новых данных в лист */
    // public void addPerson(Human person){
    //     personList.add(person);
    // }


    // public List<Human> getFamily(String name){
    //     List<Human> res = new ArrayList<>();
    //     for (Human person: personList){
    //         if (person.getName() == name){
    //             res.add(person);
    //         }
    //     }
    //     return res;
    // }
}


