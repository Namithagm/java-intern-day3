import java.util.ArrayList;
import java.util.Scanner;

public class StudentRec {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentRec(){
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

  public void updateStudent() {
    System.out.print("Enter ID of student to update: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Consume newline
    for (Student student : students) {
        if (student.getId() == id) {
            System.out.print("Enter new Name: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.print("Enter new Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            student.setMarks(marks);
            System.out.println("Student updated successfully!");
            return;
        }
    }
    System.out.println("Student not found.");
}


    public void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = scanner.nextInt();
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student deleted successfully!");
    }

    public void run() {
        while (true) {
            System.out.println("\nStudent Record Management");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        StudentRec srm = new StudentRec();
        srm.run();
    }
}

 

