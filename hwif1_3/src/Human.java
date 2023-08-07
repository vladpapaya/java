public class Human {
    int age;
    String name;
    int money;

    Human() {
        this.age = age;
        this.name = name;
        this.money = money;
    }

    void growUp(int newAge) {
        this.age += newAge;
    }

    void changeName(String name) {
        this.name = name;
    }

    void changeMoneyBigger (int newMoney){
        this.money += newMoney;
    }

    void changeMoneyLess (int newMoney){
        this.money -= newMoney;
    }

}
