import java.util.Scanner;

public class HeronsFormulaTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the lengths of the sides
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        // Calculating semi-perimeter
        double s = (a + b + c) / 2.0;

        // Calculating the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display the area
        System.out.printf("The area of the triangle is: %.2f\n", area);

        scanner.close();
    }
}