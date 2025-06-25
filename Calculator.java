
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of inputs must be greater than zero.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int sub = numbers[0];
        int mul = 1;
        double div = numbers[0];

        for (int i = 0; i < n; i++) {
            sum += numbers[i];
            mul *= numbers[i];
        }

        for (int i = 1; i < n; i++) {
            sub -= numbers[i];
            if (numbers[i] != 0) {
                div /= numbers[i];
            } else {
                System.out.println("Division by zero encountered. Result undefined.");
                div = Double.NaN;
                break;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction (left to right): " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division (left to right): " + (Double.isNaN(div) ? "Undefined" : div));

        sc.close();
    }
}