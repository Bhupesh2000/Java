class Vehicle{
    protected String brand;
    Vehicle(){
        System.out.println("Vehicle class is intiated");
    }

    Vehicle(String brand){
        this.brand = brand;
    }

    protected void drive(){
        System.out.println("Driving a " + brand);
    }
}

// One child can have only one direct parent
class Car extends Vehicle{
    public int seats;

    Car(int seats, String brand){
        super(brand);
        this.seats = seats;
    }

    public void displayInfo(){
        System.out.println(super.brand + " has " + seats + " seats");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c1 = new Car(4, "Hyundai");
        c1.drive();
        c1.displayInfo();
    }
}