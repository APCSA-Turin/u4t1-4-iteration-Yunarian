public class Person {
    // instance variable
    private String name;
    private boolean isVaccinated;

    // constructor
    public Person(String name) {
        this.name = name;
        isVaccinated = false;
    }

    // getters
    public boolean isVaccinated() {
        return isVaccinated;
    }

    public String getName() {
        return name;
    }

    // setter
    public void getVaccinated() {
        isVaccinated = true;
    }
}
