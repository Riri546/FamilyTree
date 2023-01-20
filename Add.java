package FamilyTree;

public class Add {
    FamilyTree<Human> tree = new FamilyTree<Human>();
    //Это тестовый файл. Пытаюсь понять как убрать добавление людей из view 
    public void myHuman(){
        Human h1 = new Human(1, "Мария", 55);
        tree.addHuman(h1);
        Human h2 = new Human(2, "Валерий", 58);
        tree.addHuman(h2);
        Human h3 = new Human(3, "Дмитрий", 30, h2, h1);
        tree.addHuman(h3);
        Human h4 = new Human(4, "Дарья", 35);
        tree.addHuman(h4);
        Human h5 = new Human(5, "София", 10, h3, h4, h2, h1);
        tree.addHuman(h5);
    }
    
}
