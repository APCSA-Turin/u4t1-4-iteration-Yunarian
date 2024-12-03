public class RaceUtility {

    public static double milesToKm(double miles) {
        return miles * 1.609344;
    }

    public static double kmToMiles(double kilometers) {
        return kilometers * 0.621371; 
    }

    public static String makeProper(String string) {
        String firstLetter = string.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.substring(i, i + 1).equals(" ")) {
                firstLetter += string.substring(i + 1, i + 2).toUpperCase();
            } else {
                firstLetter += string.substring(i + 1, i + 2).toLowerCase();
            }
        }
        return firstLetter;
    }
}
