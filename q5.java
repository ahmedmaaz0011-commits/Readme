import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter voltage (volts): ");
        double voltage = scanner.nextDouble();
        System.out.print("Enter current (amperes): ");
        double current = scanner.nextDouble();
        double power = voltage * current;
        System.out.printf("Power consumed: %.2f Watts\n", power);
        scanner.close();
    }
}