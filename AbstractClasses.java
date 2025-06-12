abstract class Employee{
    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + " Id: " + id);
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}

class ContractEmployee extends Employee{
    int daysWorked;
    double perDayRate;

    ContractEmployee(String name, int id, int daysWorked, double perDayRate){
        super(name, id);
        this.daysWorked = daysWorked;
        this.perDayRate = perDayRate;
    }

    @Override
    public double calculateSalary(){
        return daysWorked * perDayRate;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Singla", 1, 30000);
        Employee e2 = new PartTimeEmployee("Bansal", 2, 2, 100);
        Employee e3 = new ContractEmployee("Rathore", 3, 4, 500);

        Employee[] employees = {e1, e2, e3};

        for(Employee emp : employees){
            emp.displayInfo();
            double salary = emp.calculateSalary();
            System.out.println("Salary earned: " + salary);
        }
    }
}