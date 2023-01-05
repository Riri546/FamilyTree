package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    
    private List<Human> personList;
    
    public FamilyTree(List<Human> personList) {
       this.personList = personList;
    }
    
    public FamilyTree() {
        this(new ArrayList<>());
    }
    
    public List<Human> getPersonList() {
        return personList;
    }

    public void setProductList(List<Human> personList) {
        this.personList = personList;
    }

    public void addPerson(Human person){
        personList.add(person);
    }
}


