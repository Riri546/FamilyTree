package FamilyTree;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Record {
    

    public static void main(String[] args) {
        FamilyTree<Human> tree = new FamilyTree<Human>();
        Path out = Paths.get("output.txt");
        List<Human> arrayList = new ArrayList<>((tree.getTreeHuman()));
        

        Files.write(out, arrayList, Charset.defaultCharset());
        // // запись всей строки
        // String text = "Hello Gold!";
        // writer.write(text);
        // // запись по символам
        // writer.append('\n');
        // writer.append('E');

        // writer.flush();
    }
}
