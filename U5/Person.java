public class Person {
    // instance variables
    private String firstName;
    private String lastName;
    private int meetings;

    // constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        meetings = 0;
    }

    // getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public int getMeetings() {
        return meetings;
    }

    public void incrementMeetings() {
        meetings++;
    }

    // other public methods
    public void meet(Person person) {
        meetings++;
        person.incrementMeetings();
        System.out.println("Hello, my name is " + firstName + "\nHi, my name is " + person.getFirstName());
    }
}
