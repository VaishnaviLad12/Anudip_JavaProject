StudentDemo.java
import java.util.HashSet;
import java.util.Objects;

class Student {
    private int studentID;
    private String studentName;

    // Constructor
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return studentID == other.studentID;
    }

    // Overriding hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    // Getter methods
    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    // toString method
    @Override
    public String toString() {
        return "StudentID: " + studentID + ", StudentName: " + studentName;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create a HashSet to store students
        HashSet<Student> studentSet = new HashSet<>();

        // Create a few students and add them to the HashSet
        Student student1 = new Student(101, "John");
        Student student2 = new Student(102, "Alice");
        Student student3 = new Student(103, "Bob");

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        // Create another student with the same studentID
        Student student4 = new Student(101, "Jane");

        // Add student4 to the HashSet
        boolean added = studentSet.add(student4);

        // Print if the student is added or not
        if (added) {
            System.out.println("Student with ID " + student4.getStudentID() + " is added to the HashSet.");
        } else {
            System.out.println("Student with ID " + student4.getStudentID() + " is not added to the HashSet.");
        }

        // Print all the students in the HashSet
        System.out.println("\nStudents in the HashSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}

Output
Student with ID 101 is not added to the HashSet.

Students in the HashSet:
StudentID: 101, StudentName: John
StudentID: 102, StudentName: Alice
StudentID: 103, StudentName: Bob
