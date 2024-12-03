
public class Main {
    public static void main(String[] args) {
        System.out.println(RaceUtility.milesToKm(13.85));
        // 2. use static milesToKm method to convert 26.42
        //    miles to kilometers; print the converted result
        System.out.println(RaceUtility.milesToKm(26.42));

        // --- test kmToMiles method ---
        // 3. use static kmToMiles method to convert 40 km
        //    to miles; print the converted result
        System.out.println(RaceUtility.kmToMiles(40));

        // 4. use static kmToMiles method to convert 3.5 km
        //    to miles; print the converted result
        System.out.println(RaceUtility.kmToMiles(3.5));

        // --- test makeProper method ---
        // 5. use static makeProper method to make the string
        // "welcome to the marathon!" proper; print the result
        System.out.println(RaceUtility.makeProper("welcome to the marathon!"));

        // 6. use static makeProper method to make the string
        // "It's TIME for THE 5k!" proper; print the result
        System.out.println(RaceUtility.makeProper("It's TIME for THE 5k!"));

    }
}
