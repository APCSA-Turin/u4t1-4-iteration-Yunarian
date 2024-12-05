public class Student {
    // instance variables
    private String firstName;
    private int points;

    // static variables
    private static int totalPointsEarned = 0;
    private static int greatestPointsEarned = 0;

    // constructor
    public Student(String firstName) {
        this.firstName = firstName;
        points = 0;
    }

    public void addPoints(int numPoints) {
        points += numPoints;
        totalPointsEarned += numPoints;
        if (points > greatestPointsEarned) {
            greatestPointsEarned = points;
        }
    }

    public static int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public static int getGreatestPoints() {
        return greatestPointsEarned;
    }

    public String studentInfo() {
        return "Student: " + firstName + "\nStudent's points: " + points;
    }

    public static String classInfo() {
        return "Total points earned by all students: " + totalPointsEarned 
                +"\nMost points earned by a single student: " + greatestPointsEarned;
    }
}
