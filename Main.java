package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        Service service = new Service(tree);

        Human h1 = new Human("Мария", 54);
        tree.addHuman(h1);
        Human h2 = new Human("Валерий", 58);
        tree.addHuman(h2);
        Human h3 = new Human("Дмитрий", 31, h2, h1);
        tree.addHuman(h3);
        //Сейчас при выводе h5 помимо отца и матери выводятся бабушка и дедушка, но он
        // Human h4 = new Human("Дарья", 29);
        // tree.addHuman(h4);
        // Human h5 = new Human("София", 10, h3, h4);
        // tree.addHuman(h5);

        System.out.println("До сортировки: ");
        for (Human human : tree) {
            System.out.println(human);
        }

        System.out.println();
        System.out.println("После сортировки по имени: ");
        service.sortByName();

        for (Human human : tree) {
            System.out.println(human);
        }
    }
}
