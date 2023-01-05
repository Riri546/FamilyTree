package FamilyTree;

import java.util.ArrayList;

public class Communication {

    private Human h1;
    private Human h2;
    private int degreeKinship1;
    private int degreeKinship2;

    public Human getH1(){
        return h1;
    }

    public Human getH2(){
        return h2;
    }

    public int getDegreeKinship1(){
        return degreeKinship1;
    }

    public int getDegreeKinship2(){
        return degreeKinship2;
    }
    public Communication(Human h1, Human h2, int degreeKinship1, int degreeKinship2){
        this.h1 = h1;
        this.h2 = h2;
        this.degreeKinship1 = degreeKinship1;
        this.degreeKinship2 = degreeKinship2;
    }




}
