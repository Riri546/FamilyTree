package FamilyTree;

import java.util.Scanner;

public class UI implements View{
    Controller contr = new Controller();
    Presenter pres = new Presenter();
    Scanner scanner = new Scanner(System.in);

    public void start() {
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
    }

    public void communicationUse() {
        int numberUser = scanner.nextInt();
        System.out.println();

        // Проверяем, какую цифру выбрал пользователь и выдаем нужный ответ
        if (numberUser == 1) {
            System.out.println("Пожалуйста! Как вы и просили список людей из семейного древа: ");
            contr.withoutSorting();
        } else if (numberUser == 2) {
            System.out.println("Это древо отсортировано в алфавитном порядке по имени: ");
            pres.treeByName();
        } else if (numberUser == 3) {
            System.out.println("Это древо представленно в виде отсортированного по возрасту: ");
            pres.treeByAge();
        }
        if (numberUser == 4) {
            System.out.print("Введите порядковый номер члена этой семьи: ");
            int indexFamily = scanner.nextInt();
            contr.searchPerson(indexFamily);
        } else if (numberUser >= 5) {
            System.out.println("Похоже, вы что-то ввели неверно");
        }
        scanner.close();
    }
}
