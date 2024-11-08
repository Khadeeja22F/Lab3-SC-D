package mytask2;
public class Rectangle {
    private double length;
    private double width;
    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    // Parameterized constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }
    // Getter for length
    public double getLength() {
        return length;
    }
    // Setter for length with validation
    public void setLength(double length) {
        validateDimension(length);
        this.length = length;
    }
    // Getter for width
    public double getWidth() {
        return width;
    }
    // Setter for width with validation
    public void setWidth(double width) {
        validateDimension(width);
        this.width = width;
    }
    // Method to validate dimensions
    private void validateDimension(double value) {
        if (value <= 0.0 || value >= 20.0) {
            throw new IllegalArgumentException("Length and width must be greater than 0.0 and less than 20.0");
        }
    }
    // Method to calculate parameter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}
