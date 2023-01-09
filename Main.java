package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Human h1 = new Human("Мария", 54, null, null);
        tree.addHuman(h1);
        Human h2 = new Human("Валерий", 58, null, null);
        tree.addHuman(h2);
        Human h3 = new Human("Дмитрий", 31, h2, h1);
        tree.addHuman(h3);
        Human h4 = new Human("Дарья", 29, null, null);
        tree.addHuman(h4);
        Human h5 = new Human("София", 10, h3, h4);
        tree.addHuman(h5);

        // for (Human human: family) {
        //     System.out.println(Human);
        // }

        // System.out.println();
        
        // Human h1 = new Human("Коля", 24);
        // tree.treeHuman.add(h1);
        // Human h2 = new Human("Даша", 53);
        // tree.treeHuman.add(h2);
        // Human h3 = new Human("Витя", 65);
        // tree.treeHuman.add(h3);

        
        // h1.addCommunications(h2, "Дети", "Родители");
        // h1.addCommunications(h3, "Дети", "Родители");

        // h1.toString("Родители");

        // tree.preOrder(h1, "");
    }
}
