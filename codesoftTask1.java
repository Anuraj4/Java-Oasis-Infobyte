import java.util.Scanner;
import java.util.Random;

public class codesoftTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerLimit = 1;
        int upperLimit = 100;
        int maxAttempts = 10;
        int totalRounds = 0;
        int totalScore = 0;
        
        while (true) {
            int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            System.out.println("\nRound " + (totalRounds + 1));
            
            for (int attempt = 0; attempt < maxAttempts; attempt++) {
                System.out.println("\nAttempt " + (attempt + 1) + "/" + maxAttempts);
                System.out.print("Guess the number between " + lowerLimit + " and " + upperLimit + ": ");
                int guess = scanner.nextInt();
                
                if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number!");
                    int score = maxAttempts - attempt;
                    totalScore += score;
                    System.out.println("Score for this round: " + score);
                    break;
                }
            }
            
            totalRounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        
        System.out.println("\nGame over! You played " + totalRounds + " rounds.");
        System.out.println("Total score: " + totalScore);
    }
}
