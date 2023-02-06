package FamilyTree;

public class h {
    FamilyTree<Human> tree = new FamilyTree<>();
    Service service = new Service(tree);
    

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
