public class Employee {
    // instance variables
    private String firstName;
    private String lastName;
    private int employeeId;

    // static variables
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    // constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentEmployeeID++;
        employeeId = mostRecentEmployeeID;
        totalEmployeesCreated++;
    }

    //getters
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getId() {
        return employeeId;
    }

    public static int getMostRecentEmployeeId() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    // public method which returns info about a specific employee
    // and the employee class
    public String employeeInfo() {
        String returnedString = "--------------------------\n";
        returnedString += "Employee full name: " + getFullName() + "\n";
        returnedString += "Employee id: " + employeeId + "\n";
        returnedString += "Most recent ID assigned: " + getMostRecentEmployeeId() + "\n";
        returnedString += "Total employees hired: " + getTotalEmployeesCreated() + "\n";
        returnedString += "--------------------------\n";
        return returnedString;
    }
}