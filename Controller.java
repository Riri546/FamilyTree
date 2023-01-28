package FamilyTree;

public class Controller {
    FamilyTree<Human> tree = new FamilyTree<>();
    Service service = new Service(tree);
    
    public void withoutSorting() {
        tree.myHuman(null);
        for (Human human : tree) {
            System.out.println(human);
        }
    }

    public void treeByName() {
        tree.myHuman(null);
        service.sortByName();

        for (Human human : tree) {
            System.out.println(human);
        }
    }

    public void treeByAge() {
        tree.myHuman(null);
        service.sortByAge();

        for (Human human : tree) {
            System.out.println(human);
        }
    }
}
