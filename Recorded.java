package FamilyTree;

import java.io.*;

public class Recorded {
    public static void main(String[] args) throws FileNotFoundException {
        FamilyTree tree = new FamilyTree<Human>();
        String tmp = tree.getTreeHuman().toString();
        PrintWriter pw = new PrintWriter(new FileOutputStream("file"));
        // pw.println(tmp.substring(1, tmp.length() - 1));
        // pw.println(tmp);
        pw.write(tmp.substring(1, tmp.length() - 1));

    }
}
