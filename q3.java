import java.util.Scanner;

public class DiscountedSellingPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: original selling price
        System.out.print("Enter the original selling price: ");
        double originalPrice = scanner.nextDouble();

        // Input: discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate discounted selling price
        double discountAmount = (discountPercent / 100) * originalPrice;
        double discountedPrice = originalPrice - discountAmount;

        // Output: discounted selling price
        System.out.println("Discounted Selling Price: " + discountedPrice);

        scanner.close();
    }
}