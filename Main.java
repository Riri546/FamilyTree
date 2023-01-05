package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Human h1 = new Human("Человек1", 25);
        tree.treeHuman.add(h1);
        Human h2 = new Human("Человек2", 5);
        tree.treeHuman.add(h2);
        Human h3 = new Human("Человек3", 4);
        tree.treeHuman.add(h3);

        h1.addCommunications(h2, 1, 2);
        h1.addCommunications(h3, 1, 2);

        h1.printRelatives(2);

        tree.preOrder(h1,"");
    }


    // public static void main(String[] args) {
        // FamilyTree family = new FamilyTree();


        // Human person1 = new Human("Юрий", 59);
        // Human person2 = new Human("Рита", 57);
        // Human person3 = new Human("Станислав", 40);
        // Human person4 = new Human("Юлия", 37);
        // Human person5 = new Human("Лилия", 21);
        // Human person6 = new Human("Виталий", 12);

        // family.addPerson(person1);
        // family.addPerson(person2);
        // family.addPerson(person3);
        // family.addPerson(person4);
        // family.addPerson(person5);
        // family.addPerson(person6);

        // person4 = new Human(person1, person2);
        // person5 = new Human(person1, person2);
        // person6 = new Human(person3, person4);

        

        // System.out.println(family.getFamily("Виталий"));
    }
// }

