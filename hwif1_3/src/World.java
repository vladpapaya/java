import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human h = new Human();
        h.age = 11;
        h.name = "N";
        h.money = 100;
        System.out.println(h.age);
        System.out.println(h.name);
        System.out.println(h.money);
        int newAge = sc.nextInt();
        String newName = sc.next();
        int newMoney = sc.nextInt();
        h.growUp(newAge);
        h.changeName(newName);
        h.changeMoneyBigger(newMoney);
        System.out.println(h.age);
        System.out.println(h.name);
        System.out.println(h.money);
        h.changeMoneyLess(newMoney);
        System.out.println(h.money);


        Car m = new Car("green",100,"Audi");
        m.maxSpeed = 100;
        m.color = "green";
        m.model = "Audi";
        System.out.println(m.color);
        System.out.println(m.maxSpeed);
        System.out.println(m.model);
        m.changeColor();
        m.increaseSpeed();
        System.out.println(m.color);
        System.out.println(m.maxSpeed);
        System.out.println(m.model);

        //#2
        Cat b = new Cat ("black", 1);
        int newLength = sc.nextInt();
        String newColor = sc.next();
        System.out.println(b.color);
        System.out.println(b.tailLength);
        b.changeColor(newColor);
        b.changeTailLength(newLength);
        System.out.println(newLength);
        System.out.println(newColor);


        //#3
        Table t = new Table("black", "big", "wood");
        System.out.println(t.size);
        System.out.println(t.color);
        System.out.println(t.material);
        String newSize = sc.next();
        String newColoring = sc.next();
        String newMaterial = sc.next();
        t.changingColor(newColoring);
        t.changingSize(newSize);
        t.changingMaterial(newMaterial);
        System.out.println(newColoring);
        System.out.println(newMaterial);
        System.out.println(newSize);


        //#5
        Dog carl = new Dog(100);
        System.out.println("vvedite calorie");
        int foodCalories = sc.nextInt();
        carl.eat(foodCalories);
        System.out.println("vse");
    }

}
