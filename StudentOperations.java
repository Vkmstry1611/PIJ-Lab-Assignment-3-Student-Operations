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

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    public void searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.display();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }



    public void searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        System.out.println("Student with name '" + name + "' not found.");
    }

    public void searchByPosition(int pos) {
        if (pos >= 0 && pos < students.size()) {
            students.get(pos).display();
        } else {
            System.out.println("Invalid position.");
        }
    }



    
}