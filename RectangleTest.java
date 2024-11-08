package mytask2;
import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a Rectangle object using the default constructor
        Rectangle rectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        displayRectangleDetails(rectangle);
        // Input length and width from the user
        try {
            System.out.print("Enter length (0 < length < 20): ");
            double length = scanner.nextDouble();
            rectangle.setLength(length);

            System.out.print("Enter width (0 < width < 20): ");
            double width = scanner.nextDouble();
            rectangle.setWidth(width);

            System.out.println("Updated Rectangle:");
            displayRectangleDetails(rectangle);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }

    // Method to display rectangle details
    private static void displayRectangleDetails(Rectangle rectangle) {
        System.out.printf("Length: %.2f%n", rectangle.getLength());
        System.out.printf("Width: %.2f%n", rectangle.getWidth());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
    }
}
