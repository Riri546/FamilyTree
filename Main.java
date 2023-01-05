package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Human h1 = new Human("Коля", 25);
        tree.treeHuman.add(h1);
        Human h2 = new Human("Даша", 20);
        tree.treeHuman.add(h2);
        Human h3 = new Human("Витя", 4);
        tree.treeHuman.add(h3);

        h1.addCommunications(h2, 1, 2);
        h1.addCommunications(h3, 1, 2);

        h1.printRelatives(2);

        tree.preOrder(h1, "");
    }
}
