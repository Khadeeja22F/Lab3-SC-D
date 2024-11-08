package mytask1; 
import java.util.Scanner;
public class Student {
    private String name;
    private int totalMarks;
    private int obtainedMarks;
    // Enum for Grades
    public enum Grade {
        A_PLUS(4.0), A(4.0), B(3.0), C(2.0), D(1.0), F(0.0);       
        private final double gpa;        
        Grade(double gpa) {
            this.gpa = gpa;
        }        
        public double getGPA() {
            return gpa;
        }
    }
    // Constructor
    public Student(String name, int totalMarks, int obtainedMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }
    // Method to calculate percentage
    public double calculatePercentage() {
        return (double) obtainedMarks / totalMarks * 100;
    }
    // Method to determine grade
    public Grade determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return Grade.A_PLUS;
        if (percentage >= 80) return Grade.A;
        if (percentage >= 70) return Grade.B;
        if (percentage >= 60) return Grade.C;
        if (percentage >= 50) return Grade.D;
        return Grade.F;
    }

    // Method to display student details
    public void displayStudentDetails() {
        double percentage = calculatePercentage();
        Grade grade = determineGrade();        
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Total Marks: %d%n", totalMarks);
        System.out.printf("Obtained Marks: %d%n", obtainedMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("Grade: %s%n", grade);
        System.out.printf("GPA: %.2f%n", grade.getGPA());
    }
    // Method to handle input
    public static Student inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Total Marks: ");
        int totalMarks = scanner.nextInt();
        System.out.print("Enter Obtained Marks: ");
        int obtainedMarks = scanner.nextInt();
        // Input validation
        if (obtainedMarks > totalMarks || obtainedMarks < 0 || totalMarks <= 0) {
            System.out.println("Invalid marks entered. Please ensure obtained marks are not greater than total marks and both are non-negative.");
            return null;
        }
        return new Student(name, totalMarks, obtainedMarks);
    }
    // Main method to run the program
    public static void main(String[] args) {
        Student student = inputStudentDetails();
        if (student != null) {
            student.displayStudentDetails();
        }
    }
}