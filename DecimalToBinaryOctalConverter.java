import java.util.Scanner;

public class DecimalToBinaryOctalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting input from user
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        
        scanner.close();
        
        // Convert to binary and octal
        String binary = decimalToBinary(decimalNumber);
        String octal = decimalToOctal(decimalNumber);
        
        // Display the result
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
    }

    public static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static String decimalToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}
