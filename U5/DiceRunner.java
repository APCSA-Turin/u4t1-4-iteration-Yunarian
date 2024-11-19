public class DiceRunner {
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);
    int sides = dice1.getSides();
    System.out.println(sides);
    System.out.println("default count = " + dice1.getRollCount());
    System.out.println("default roll = " + dice1.getRollValue());
    System.out.println();

    dice1.roll();
    System.out.println("count = " + dice1.getRollCount());
    System.out.println("roll = " + dice1.getRollValue());
    dice1.roll();
    System.out.println("count = " + dice1.getRollCount());
    System.out.println("roll = " + dice1.getRollValue());
    dice1.roll();
    System.out.println("count = " + dice1.getRollCount());
    System.out.println("roll = " + dice1.getRollValue());
    System.out.println();

    dice1.setSides(20);
    sides = dice1.getSides();
    System.out.println(sides);
    dice1.roll();
    System.out.println("count = " + dice1.getRollCount());
    System.out.println("roll = " + dice1.getRollValue());
    System.out.println();

    Dice dice2 = new Dice(10);
    dice2.roll();
    dice2.roll();
    dice2.roll();
    dice2.roll();
    dice2.roll();
    dice2.roll();
    dice2.roll();
    System.out.println("count = " + dice2.getRollCount());
    System.out.println("count = " + dice1.getRollCount());
    }
    

}
