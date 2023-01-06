package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Communications {

    private Human h1;
    private Human h2;
    // private int degreeKinship1;
    // private int degreeKinship2;
    
    private String degreeKinship1 = "Дети";
    private String degreeKinship2 = "Родители";

    List<Human> com = new ArrayList<>();
    com.add(degreeKinship1);

    public Human getH1() {
        return h1;
    }

    public Human getH2() {
        return h2;
    }

    public String getDegreeKinship1() {
        return degreeKinship1;
    }

    public String getDegreeKinship2() {
        return degreeKinship2;
    }

    public Communications(Human h1, Human h2, ) {
        this.h1 = h1;
        this.h2 = h2;
        this.degreeKinship1 = degreeKinship1;
        this.degreeKinship2 = degreeKinship2;
    }
}
