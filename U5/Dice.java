public class Dice {
    // instance variables
    private int sides;
    private int timesRolled;
    private int recentRoll;

    // constructors
    public Dice(int sides) {
        this.sides = sides;
        timesRolled = 0;
        recentRoll = 0;
    }

    // getters
    public int getSides() {
        return sides;
    }

    public int getRollCount() {
        return timesRolled;
    }

    public int getRollValue() {
        return recentRoll;
    }

    // setters
    public void setSides(int newSideNumber) {
        sides = newSideNumber;
    }

    // public methods
    public int roll() {
        int rolled = (int) (Math.random() * sides) + 1;
        recentRoll = rolled;
        timesRolled++;
        return rolled;
    }
}
