public class SpinnerRunner {
    public static void main(String[] args) {
        Spinner spinner = new Spinner(10);

        spinner.spin();  System.out.println(spinner.getSpinValue());
        System.out.println(spinner.getNumSpins());
        System.out.println(spinner.getSumSpins());
        System.out.println(spinner.average());
        System.out.println();

        spinner.spin();
        System.out.println(spinner.getSpinValue());
        System.out.println(spinner.getNumSpins());
        System.out.println(spinner.getSumSpins());
        System.out.println(spinner.average());
        System.out.println();

        spinner.spin();
        System.out.println(spinner.getSpinValue());
        System.out.println(spinner.getNumSpins());
        System.out.println(spinner.getSumSpins());
        System.out.println(spinner.average());
        System.out.println();

        spinner.spin();
        System.out.println(spinner.getSpinValue());
        System.out.println(spinner.getNumSpins());
        System.out.println(spinner.getSumSpins());
        System.out.println(spinner.average());
        System.out.println();

    }
}
