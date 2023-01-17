package FamilyTree;

import java.util.Scanner;

public class View {
    FamilyTree<Human> tree = new FamilyTree<>();
    Service service = new Service(tree);
    Scanner scanner = new Scanner(System.in);

    public void communicationUse() {
        Human h1 = new Human("Мария", 54);
        tree.addHuman(h1);
        Human h2 = new Human("Валерий", 58);
        tree.addHuman(h2);
        Human h3 = new Human("Дмитрий", 31, h2, h1);
        tree.addHuman(h3);
        Human h4 = new Human("Дарья", 29);
        tree.addHuman(h4);
        // Сейчас при выводе h5 помимо отца и матери,выводятся отец отца и мать отца и
        // плюсом они же как бабушка с дедушкой
        Human h5 = new Human("София", 10, h3, h4, h2, h1);
        tree.addHuman(h5);

        System.out.println("Здравствуйте! Это генеологическое древо.");
        System.out.println(
                "В каком порядке хотите просмотреть список людей?" + "\n" +
                        "1 - Вывести полный список людей из семейного древа" + "\n" +
                        "2 - Отсортировать полный список по имени в алфавитном порядке" + "\n" +
                        "3 - Отсортировать по возросту в порядке возрастания");

        System.out.println();
        System.out.print("Введите цифру для выполнения действия: ");
        int numberUser = scanner.nextInt();
        System.out.println();

        if (numberUser == 1) {
            System.out.println("Пожалуйста! Как вы и просили список людей из семейного древа: ");

            for (Human human : tree) {
                System.out.println(human);
            }
        }
        if (numberUser == 2) {
            System.out.println("Это древо отсортировано в алфавитном порядке по имени: ");
            service.sortByName();

            for (Human human : tree) {
                System.out.println(human);
            }
        }
        if (numberUser == 3) {
            System.out.println("Это древо представленно в виде отсортированного по возрасту: ");
            service.sortByAge();

            for (Human human : tree) {
                System.out.println(human);
            }

        }

    }

}
