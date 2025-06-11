class Employee{
    public String name;

    Employee(String name){
        this.name = name;
    }
}

class Manager extends Employee{
    Manager(String name){
        super(name); // Calls parent constructor
    }

    void printName(){
        System.out.println("Hi, My name is " + this.name);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Manager m = new Manager("Singla");
        m.printName();
    }
}