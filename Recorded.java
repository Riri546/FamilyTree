package FamilyTree;

import java.io.*;

public class Recorded implements Serializable {
    private String name;
    private int age;
    private String contact;

    public Recorded(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Древо{" +
                "Имя ='" + name + '\'' +
                ", Возрост ='" + age + '\'' +
                ", Кем является ='" + contact + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Recorded h1 = new Recorded("Коля", 24, "Сын Даши и Вити");
        Recorded h2 = new Recorded("Даша", 53, "Мать Коли");
        Recorded h3 = new Recorded("Витя", 65, "Отец Коли");

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}

// package FamilyTree;

// import java.io.FileWriter;
// import java.io.IOException;
// import java.nio.charset.Charset;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Record {
 

//     public static void main(String[] args) {
//         // FamilyTree<Human> tree = new FamilyTree<Human>();
//         // Path out = Paths.get("output.txt");
//         // List<Human> arrayList = new ArrayList<>((tree.getTreeHuman()));
        

//         // Files.write(out, arrayList, Charset.defaultCharset());
//         // Files.write(out, arrayList, Charset.defaultCharset());

//         // запись всей строки
//         String text = "Hello Gold!";
//         writer.write(text);
//         // запись по символам
//         writer.append('\n');
//         writer.append('E');

//         // writer.flush();
//     }
// }
