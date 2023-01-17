package FamilyTree;

import java.util.Scanner;

public class View {
    FamilyTree<Human> tree = new FamilyTree<>();
    Service service = new Service(tree);
    Scanner scanner = new Scanner(System.in);

    public void communicationUse() {
        System.out.println("Здравствуйте! Это генеологическое древо");
        System.out.print(
                "В каком порядке хотите просмотреть список людей?" + "\n" +
                    "1 - Вывести полный список людей из семейного древа" + "\n" +
                    "2 - Отсортировать полный список в алфавитном порядке" + "\n" +
                    "3 - Отсортировать по возросту(в порядке возрастания)");
        int numberUser = scanner.nextInt();
        if (numberUser == 1) {
            System.out.println("Пожалуйста! Как вы и просили список людей из семейного древа: ");
            for (Human human : tree) {
                System.out.println(human);
            }
        }

    }

}
