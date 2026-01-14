import java.util.Scanner;

public class TrapezoidAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of first parallel side (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter length of second parallel side (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter height (h): ");
        double h = scanner.nextDouble();

        double area = h * (a + b) / 2;
        System.out.printf("Area of the trapezoid: %.2f\n", area);

        scanner.close();
    }
}