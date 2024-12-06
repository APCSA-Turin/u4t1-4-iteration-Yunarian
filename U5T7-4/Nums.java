public class Nums {
    // instance variables
    private int min;
    private int max;
    private int individualGeneratedNums;

    // static variables
    private static int countOfGeneratedNums = 0;

    // constructor
    public Nums(int int1, int int2) {
        min = int1;
        max = int2;
        individualGeneratedNums = 0;
    }

    public static int getTotalNumbersGenerated() {
        return countOfGeneratedNums;
    }

    public int getRandomNumsGenerated() {
        return individualGeneratedNums;
    }

    public int randBetween() {
        countOfGeneratedNums++;
        individualGeneratedNums++;
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}