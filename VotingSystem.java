import java.util.Scanner;

public class VotingSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        
        // Voting eligibility check
        assert isEligible(age) : "Assertion failed: Voter is not eligible to vote";
        
        System.out.println("Voter is eligible to vote.");
        castVote();
    }
    
    public static boolean isEligible(int age) {
        return age >= 18;
    }
    
    public static void castVote() {
        System.out.println("Vote cast successfully.");
    }
}
