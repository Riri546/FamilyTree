package FamilyTree;

public class Controller {
    FamilyTree<Human> tree = new FamilyTree<>();
    // Service service = new Service(tree);
    
    public void withoutSorting() {
        tree.myHuman(null);
        for (Human human : tree) {
            System.out.println(human);
        }
    }

    // public void treeByName() {
    //     tree.myHuman(null);
    //     service.sortByName();

    //     for (Human human : tree) {
    //         System.out.println(human);
    //     }
    // }

    // public void treeByAge() {
    //     tree.myHuman(null);
    //     service.sortByAge();

    //     for (Human human : tree) {
    //         System.out.println(human);
    //     }
    // }

    public void searchPerson(int idFamily){
        tree.myHuman(null);
            for (int i = 0; i <= tree.getTreeHuman().size();) {
                if(i > tree.getTreeHuman().size()){
                    System.out.println("К сожалению в списке нет такого номера");
                }
                else{
                    System.out.println(tree.getTreeHuman().get(idFamily - 1));
                }
                break;
            }
    }
}
