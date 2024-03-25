import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        scanner.close();
        
        // Check if the number is a palindrome
        boolean isPalindrome = checkPalindrome(number);
        
        // Display the result
        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }
}
