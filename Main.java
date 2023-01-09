package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        Service service = new Service(tree);

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

        for (Human human : tree) {
            System.out.println(human);
        }

        System.out.println();
        service.sortByName();

        for (Human human : tree) {
            System.out.println(human);
        }
    }
}
