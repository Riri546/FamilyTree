package FamilyTree;

import java.io.*;
import java.util.ArrayList;

public class Recorded implements Serializable {

  
    public static void main(String[] args) throws FileNotFoundException {
        FamilyTree tree = new FamilyTree<Human>();
        String tmp = tree.getTreeHuman().toString();
        PrintWriter pw = new PrintWriter(new FileOutputStream("file"));
        pw.println(tmp.substring(1, tmp.length() - 1));

    }
}
