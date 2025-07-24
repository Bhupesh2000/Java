// Resizable array.
// Maintains insertion order.
// Allows duplicates.
// Fast random access, slow insertion/removal in the middle.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Class{
    private List<String> students;

    public Class(){
        this.students = new ArrayList<>();
    }

    int addStudent(String name){
        students.add(name);
        return students.size() - 1;
    }

    void removeStudent(int index){
        students.remove(index);
    }

    void sortList(){
        students.sort(null);
    }

    void printStudentsReverse(){
        for(int i = students.size() - 1; i >= 0; i--){
            System.out.print(students.get(i) + " ");
        }
        System.out.println("");
    }

}

public class ArrayListDemo{
    public static void main(String[] args) {
        Class class1 = new Class();
        class1.addStudent("Bansal");
        class1.addStudent("Singla");
        class1.addStudent("Sharma");
        class1.printStudentsReverse();
        class1.removeStudent(0);
        class1.printStudentsReverse();
        class1.sortList();
        class1.printStudentsReverse();
    }
}

