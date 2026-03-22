import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int number = 7; // fixed number
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10:");

        guess = sc.nextInt();

        if (guess == number) {
            System.out.println("Correct! You guessed it.");
        } else {
            System.out.println("Wrong guess. The number was " + number);
        }
    }
}