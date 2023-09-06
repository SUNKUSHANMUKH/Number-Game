import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guesses = 0;

        while (true) {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();

            guesses++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + guesses + " guesses.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
    }
}
