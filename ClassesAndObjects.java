class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void printDetails(){
        System.out.println("Name: " + name + " RollNo.: " + rollNumber + " Marks: " + marks);
    }
}

public class ClassesAndObjects{
    public static void main(String[] args) {
        Student s1 = new Student("Bhupesh", 1, 98);
        Student s2 = new Student("Singla", 2, 96);

        s1.printDetails();
        s2.printDetails();
    }
}