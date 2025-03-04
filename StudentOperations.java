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



    public void updateStudent(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                System.out.println("Updating student details...");
                System.out.print("Enter new Name: ");
                String name = scan.nextLine();
                System.out.print("Enter new Date of Birth (YYYY-MM-DD): ");
                String dob = scan.next();
                System.out.print("Enter new Marks: ");
                double marks = scan.nextDouble();
                
                student.setName(name);
                student.setDoB(dob);
                student.setMarks(marks);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void deleteStudent(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                students.remove(student);
                System.out.println("Student with PRN " + prn + " removed.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}