import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting input from user
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        System.out.print("Are you a senior citizen? (yes/no): ");
        String seniorCitizen = scanner.next().toLowerCase();
        
        scanner.close();
        
        // Calculate simple interest based on customer type
        double rateOfInterest = seniorCitizen.equals("yes") ? 0.12 : 0.10;
        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, time);
        
        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time);
    }
}
