package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Human h1 = new Human("Коля", 4);
        tree.treeHuman.add(h1);
        Human h2 = new Human("Даша", 23);
        tree.treeHuman.add(h2);
        Human h3 = new Human("Витя", 26);
        tree.treeHuman.add(h3);

        h1.addCommunications(h2, "Дети",  "Родители");
        h1.addCommunications(h3, "Дети", "Родители");

        h1.printRelatives("Родители");

        tree.preOrder(h1, "");
    }
}
