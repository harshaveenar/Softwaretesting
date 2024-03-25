import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting input from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        scanner.close();
        
        // Calculate factorial of n
        long factorial = calculateFactorial(n);
        
        // Display the result
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
