package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree family = new FamilyTree();
        Human person0 = null;
        Human person1 = new Human("Юрий", 59, person0, person0);
        Human person2 = new Human("Рита", 57, person0, person0);
        Human person3 = new Human("Станислав", 40, person0, person0);
        Human person4 = new Human("Юлия", 37,person1, person2);
        Human person5 = new Human("Лилия", 21, person1, person2);
        Human person6 = new Human("Виталий", 12, person3, person4);

        family.addPerson(person1);
        family.addPerson(person2);
        family.addPerson(person3);
        family.addPerson(person4);
        family.addPerson(person5);
        family.addPerson(person6);

        System.out.println(family.getFamily("Юлия"));
    }
}

