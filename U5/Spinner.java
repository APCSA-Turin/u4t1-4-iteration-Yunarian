public class Spinner {
    // instance variables
    private int segments;
    private int recentSpin;
    private int numSpins;
    private int spinSum;

    // constructor
    public Spinner(int segments) {
        this.segments = segments;
        recentSpin = 0;
        numSpins = 0;
        spinSum = 0;
    }

    // getter methods
    public int getSpinValue() {
        return recentSpin;
    }

    public int getNumSpins() {
        return numSpins;
    }

    public int getSumSpins() {
        return spinSum;
    }

    // Other public methods
    public int spin() {
        int spin = (int) (Math.random() * segments) + 1;
        numSpins++;
        spinSum += spin;
        recentSpin = spin;
        return spin;
    }

    public double average() {
        return ((double)spinSum / numSpins);
    }
}   
