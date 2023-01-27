package FamilyTree;

import java.util.Scanner;

// Метод для общения с пользователем 
public class View {
    FamilyTree<Human> tree = new FamilyTree<>();
    Controller contr = new Controller();
    Service service = new Service(tree);
    Scanner scanner = new Scanner(System.in);

    public void communicationUse() {
        

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

        //Проверяем, какую цифру выбрал пользователь и выдаем нужный ответ 
        if (numberUser == 1) {
            System.out.println("Пожалуйста! Как вы и просили список людей из семейного древа: ");
            contr.withoutSorting();
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
        //  нужно изменить подход
        // if (numberUser == 4) {
        //     System.out.print("Введите порядковый номер члена этой семьи: ");
        //     int indexFamily = scanner.nextInt();
        //     //Пробую перенести добавление персов в другой файл 
        //     // if (indexFamily == 1) {
        //     //     System.out.println(a.myHuman());
        //     // }
        //     if (indexFamily == 1) {
        //         System.out.println(contr.m);
        //     }
        //     if (indexFamily == 2) {
        //         System.out.println(h2);
        //     }
        //     if (indexFamily == 3) {
        //         System.out.println(h3);
        //     }
        //     if (indexFamily == 4) {
        //         System.out.println(h4);
        //     }
        //     if (indexFamily == 5) {
        //         System.out.println(h5);
        //     }
        //     if (indexFamily >= 6) {
        //         System.out.println("К сожалению в списке нет такого номера");
        //     }
        // }

        if (numberUser >= 5) {
            System.out.println("Похоже, вы что-то ввели неверно");
        }
        scanner.close();
    }
}
