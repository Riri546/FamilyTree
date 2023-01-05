package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {

    //*Лист в которых я хакидываю всех людей */
    private List<Human> personList;
    
    public FamilyTree(List<Human> personList) {
       this.personList = personList;
    }
    
    public FamilyTree() {
        this(new ArrayList<>());
    }
    
    //*Для того что бы моно было читать инфо из приватной переменной, а точнее в листе*/
    public List<Human> getPersonList() {
        return personList;
    }

    //*Для того что бы модно было изменять данные в приватной переменной, а точнее в листе */
    public void setProductList(List<Human> personList) {
        this.personList = personList;
    }

    //*Для сохранения новых данных в лист */
    public void addPerson(Human person){
        personList.add(person);
    }


    public List<Human> getFamily(String name){
        List<Human> res = new ArrayList<>();
        for (Human person: personList){
            if (person.getName() == name){
                res.add(person);
            }
        }
        return res;
    }
}


