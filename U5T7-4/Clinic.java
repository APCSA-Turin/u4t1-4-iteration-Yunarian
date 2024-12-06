public class Clinic {
    // instance variables
    private Person mostRecentVacinatee;
    private int numVaccinesGiven;

    // static variables
    private static int totalClinics = 0;
    private static int totalVaccinesGiven = 0;

    // constructor
    public Clinic() {
        numVaccinesGiven = 0;
        mostRecentVacinatee = new Person(null);
        totalClinics++;
    }

    // static variable getters

    public static int getTotalClinics() {
        return totalClinics;
    }

    public static int getTotalVaccineCount() {
        return totalVaccinesGiven;
    }

    // instance variable getters
    public Person mostRecentlyVaccinated() {
        return mostRecentVacinatee;
    }

    public int getClinicVaccineCount() {
        return numVaccinesGiven;
    }

    public boolean vaccinate(Person person) {
        if(!person.isVaccinated()) {
            person.getVaccinated();
            mostRecentVacinatee = person;
            numVaccinesGiven++;
            totalVaccinesGiven++;
            return true;
        }
        return false;
    }
}
