package FamilyTree;

import java.io.*;

    public class Recorded implements Serializable {
        private String name;
        private String contact;

        public Recorded(String name, String contact) {
            this.name = name;
            this.contact = contact;
        }

        @Override
        public String toString() {
            return "Logon{" +
                    "name='" + name + '\'' +
                    ", contact='" + contact + '\'' +
                    '}';
        }

    

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Recorded igor = new Recorded("IgorIvanovich", "Khoziain");
        Recorded renat = new Recorded("Renat", "2500RUB");
       
        System.out.println("Before: \n" + igor);
        System.out.println(renat);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Externals.out"));
        out.writeObject(igor);
        out.writeObject(renat);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Externals.out"));
        igor = (Recorded) in.readObject();
        renat = (Recorded) in.readObject();

        System.out.println("After: \n" + igor);
        System.out.println(renat);
    }
}
    // public void save() {
    // Human h1 = new Human("Коля", 24);
    // Human h2 = new Human("Даша", 53);
    // Human h3 = new Human("Витя", 65);

    // }

