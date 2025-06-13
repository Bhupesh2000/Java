class Student{
    final String name; // immutable
    final int rollNo; // immutable

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", RollNo.: " + rollNo);
    }
}

class Vehicle{
    String brand;

    final void startEngine(){
        System.out.println("Vehicale started");
    }
}

class Car extends Vehicle{
    int seats;

    // @Override
    // public void startEngine(){ // cannot override because method is final
    //     System.out.println("Car started");
    // }
}

final class Constants{
    final double PI = 3.14;
}

// class childConstants extends Constants{ // cannot extend because class is final
// }

public class FinalKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Singla", 1);
        s1.displayInfo();
        // s1.name = "Bhupesh"; // cannot chnage because variable is final
    }
}