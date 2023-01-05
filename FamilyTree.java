package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    
    private List<Human> person;
    
    public FamilyTree(List<Human> person) {
       this.person = person;
    }
    
    public FamilyTree() {
        this(new ArrayList<>());
    }
    
    public List<Human> getPerson() {
        return person;
    }
}


