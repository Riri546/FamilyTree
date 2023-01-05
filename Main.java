package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree family = new FamilyTree();
        Human person1 = new Human("Лошаков Юрий Вячеславович", 59);
        Human person2 = new Human("Лошакова Рита Алексеевна", 57);
        Human person3 = new Human("Берестов Станислав Сергеевич", 40);
        Human person4 = new Human("Берестова Юлия Юрьевна", 37);
        Human person5 = new Human("Лошакова Лилия Юрьевна", 21);
        Human person6 = new Human("Берестов Виталий Станиславович", 12);

        family.addPerson(person1);
        family.addPerson(person2);
        family.addPerson(person3);
        family.addPerson(person4);
        family.addPerson(person5);
        family.addPerson(person6);

        System.out.println(family.getFamily(50));
    }
}

