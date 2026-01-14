import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Obtained marks
        System.out.print("Enter the sum of obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        // Input: Maximum marks
        System.out.print("Enter the maximum possible marks: ");
        double maxMarks = scanner.nextDouble();

        // Check for valid input
        if (maxMarks <= 0) {
            System.out.println("Maximum marks should be greater than zero.");
        } else {
            // Calculate percentage
            double percentage = (obtainedMarks / maxMarks) * 100;
            System.out.printf("Percentage marks: %.2f%%\n", percentage);
        }

        scanner.close();
    }
}