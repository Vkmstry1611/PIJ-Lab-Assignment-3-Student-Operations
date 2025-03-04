import java.util.ArrayList;
import java.util.Scanner;

class StudentOperations {
    private ArrayList<Student> students;
    private Scanner scan;

    public StudentOperations() {
        students = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }



}