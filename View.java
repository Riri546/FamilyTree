package FamilyTree;

import java.util.Scanner;

public class View {
    FamilyTree<Human> tree = new FamilyTree<>();
    Service service = new Service(tree);
    Scanner scanner = new Scanner(System.in);

    public void communicationUse() {
        Human h1 = new Human(1, "Мария", 54);
        tree.addHuman(h1);
        Human h2 = new Human(2, "Валерий", 58);
        tree.addHuman(h2);
        Human h3 = new Human(3, "Дмитрий", 31, h2, h1);
        tree.addHuman(h3);
        Human h4 = new Human(4, "Дарья", 29);
        tree.addHuman(h4);
        Human h5 = new Human(5, "София", 10, h3, h4, h2, h1);
        tree.addHuman(h5);

        System.out.println("Здравствуйте! Это генеологическое древо.");
        System.out.println(
                "В каком порядке хотите просмотреть список людей?" + "\n" +
                        "Введите нужную цифру для просмотра: " + "\n" +
                        "1 - Вывести полный список людей из семейного древа" + "\n" +
                        "2 - Отсортировать полный список по имени в алфавитном порядке" + "\n" +
                        "3 - Отсортировать по возросту в порядке возрастания" + "\n" +
                        "4 - Вывести одного человека и его родственников");

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

        if (numberUser == 4) {
            System.out.println("Введите порядковый номер члена этой семьи: ");
            int indexFamily = scanner.nextInt();
            if (indexFamily == 1) {
                System.out.println(h1);
            }
            if (indexFamily == 2) {
                System.out.println(h2);
            }
            if (indexFamily == 3) {
                System.out.println(h3);
            }
            if (indexFamily == 4) {
                System.out.println(h4);
            }
            if (indexFamily == 5) {
                System.out.println(h5);
            } else {
                System.out.println("К сожалению в списке нет такого номера");
            }
        }

        if(numberUser > 4) {
            System.out.println("Похоже, вы что-то ввели неверно");
        }

    }
}
