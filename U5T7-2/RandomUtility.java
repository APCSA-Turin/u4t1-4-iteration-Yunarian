
public class RandomUtility {
    
    private RandomUtility(){}

    // static method which returns 1 of 4 random success messages
    public static String successMessage() {
        int choosenMessage = randInt(1, 4); //A
        if (choosenMessage == 1) {
            return "Congrats! You have won the game!";
        } else if (choosenMessage == 2) {
            return "Looks like you did it! Well done!";
        } else if (choosenMessage == 3) {
            return "You've won! Nice job!";
        } else {
            return "The frogs approve of your actions.";
        }
    }

    // public static method which returns 1 of 4 random failure messages
    public static String failureMessage() {
        int choosenMessage = randInt(1, 4); //A
        if (choosenMessage == 1) {
            return "Unfortunately, you've lost. Want to try again?";
        } else if (choosenMessage == 2) {
            return "Looks like you failed. Better luck next time.";
        } else if (choosenMessage == 3) {
            return "You've lost. That's quite unfortunate, isn't it?";
        } else {
            return "The frogs are very unhappy with your actions.";
        }
    }

    // private helper method which returns a random integer value between a range, inclusive
    private static int randInt(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
