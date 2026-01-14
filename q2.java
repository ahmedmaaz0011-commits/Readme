import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}