public class Dog {
    int calories;
    boolean isHungry;

    Dog(int calories) {
        this.calories = calories;
        this.isHungry = calories < 1000;
    }

    void eat(int newCalories) {
        if (isHungry) {
            this.calories += newCalories;
            isHungry = true;
            System.out.println("hungry");
        } else {
            isHungry = false;
            System.out.println("Я не хочу кушать");
        }
    }

    void hunger() {
        this.calories -= 100;
        if (calories <= 1000 && calories > 100) {
            isHungry = true;
        } else if (calories <= 100) {
            isHungry = true;
            System.out.println("гав");
        } else {
            isHungry = false;
        }

    }
}
