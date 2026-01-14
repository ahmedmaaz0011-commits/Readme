import java.util.Scanner;

public class OriginalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter discounted selling price: ");
        double discountedPrice = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercentage = scanner.nextDouble();
        double originalPrice = discountedPrice / (1 - (discountPercentage / 100));
        System.out.printf("The original selling price is: %.2f\n", originalPrice);
        scanner.close();
    }
}