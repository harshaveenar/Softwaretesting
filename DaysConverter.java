import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting input from user
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        
        scanner.close();
        
        // Convert days to years, weeks, and remaining days
        int[] result = convertDays(days);
        
        // Display the result
        System.out.println(days + " days is equivalent to:");
        System.out.println("Years: " + result[0]);
        System.out.println("Weeks: " + result[1]);
        System.out.println("Days: " + result[2]);
    }

    public static int[] convertDays(int days) {
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        remainingDays %= 7;
        
        int[] result = {years, weeks, remainingDays};
        return result;
    }
}
