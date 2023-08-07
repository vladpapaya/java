public class Car {
    String color;
    double maxSpeed;
    String model;

    Car() {

    }

    Car(String color, double maxSpeed, String model) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void changeColor(){
        this.color = "black";
    }
    void increaseSpeed(){
        this.maxSpeed += 10.0;
    }
}
