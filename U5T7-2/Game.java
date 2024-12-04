import java.util.Scanner;

public class Game {
    // instance variables
    private int secretNum;
    private int maxAttempts;
    

    // constructor
    // instatiates a Game object with a secret number between 1 and 100
    public Game(int tries) {
        secretNum = (int)(Math.random() * 100) + 1;
        maxAttempts = tries;
    }
    
    public void runGame() {
        Scanner scan = new Scanner(System.in);
        int guessedNum = 0;
        int numAttempts = 0;
        while (numAttempts < maxAttempts && guessedNum != secretNum) { // B
            System.out.println("Guess a number between 1 and 100");
            guessedNum = scan.nextInt();
            System.out.println(compareGuess(guessedNum)); // C
            numAttempts++;
        }
        if (guessedNum != secretNum) { // B
            System.out.println(RandomUtility.failureMessage()); // E
        }
        System.out.println("It took you " + numAttempts + " guesses."); // B
        scan.close();

    }

    public String compareGuess(int guessedNum) {
        String returnedString = "";
        if (guessedNum == secretNum) { // B
            return RandomUtility.successMessage(); // E
        } else if (multipleOf7(guessedNum - secretNum)) { // D
            returnedString += "The secret number is a mutiple of 7 away from what you guessed. \n";
        } if (atLeast25Away(guessedNum)) { // C
            returnedString += "The secret number is 25 or more away from what you guessed. \n";
        } if (within5(guessedNum)) { // C
            returnedString += "The secret number is within 5 of the secret number. \n";
        } if (greaterThan(guessedNum)) { // C
            returnedString += "The secret number is less than the guessed number \n";
        } else if (guessedNum != secretNum) { // B
            returnedString += "The secret number is greater than the guessed number \n";
        }
        return returnedString;
    }

    // private boolean helper method which returns 
    // whether the guessed number is 25 or more away from the secret number
    private boolean atLeast25Away(int guessedNum) {
        return (Math.abs(guessedNum - secretNum) >= 25); // B
    }

    // private boolean helper method which returns
    // whether the guessed number is within 5 of the secret number
    private boolean within5(int guessedNum) {
        return (Math.abs(guessedNum - secretNum) <= 5); // B
    }

    // private boolean helper method which returns
    // whether the guessed number is greater than the secret number
    private boolean greaterThan(int guessedNum) {
        return guessedNum > secretNum; // B
    }

    // private boolean helper method which returns whether a number is a multiple of 7
    private static boolean multipleOf7(int num) {
        return (num % 7 == 0);
    }
}
