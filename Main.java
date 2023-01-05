package FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree family = new FamilyTree();
        Human person1 = new Human("Лошаков Юрий Вячеславович");
  
        family.add(person1);
        // vendingMachine.addProduct(product2);
        // vendingMachine.addProduct(product3);
        
        System.out.println(vendingMachine.getProductByCost(100));
    }
    // public Human(){
    //     person.add("Лошаков Юрий Вячеславович");
    //     person.add("Лошакова Рита Алексеевна");
    //     person.add("Берестова Юлия Юрьевна");
    //     person.add("Лошакова Лилия Юрьевна");
    //     person.add("Берестов Станислав Сергеевич");
    //     person.add("Берестов Виталий Станиславович"); 
    // }
}

