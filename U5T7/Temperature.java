public class Temperature {
    // instance variables
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    // constructor
    public Temperature(double high, double low, String scale) {
        highTemp = high;
        lowTemp = low;
        tempScale = scale;
        if (!scale.equals("F") && !scale.equals("C")) {
            tempScale = "F";
        }
    }

    // static method which converts Celsius to Fahrenheit
    public static double convertCtoF(double temp) {
        return temp * 1.8 + 32;
    }

    // static method which converts Fahrenehit to Celsius
    public static double convertFtoC(double temp) {
        return (temp - 32) / 1.8 ;
    }

    // If the scale is "F", convert both the high and low temps to Celcius, and change the scale to "C" 
    // If the scale is already "C", then do nothing.
    public void changeToC() {
        if (tempScale.equals("F")) {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);  
            tempScale = "C";
        }
    }

    // If the scale is "C", convert both the high and low temps to Celcius, and change the scale to "F" 
    // If the scale is already "F", then do nothing.
    public void changeToF() {
        if (tempScale.equals("C")) {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            tempScale = "F";
        }
    }

    public void tempInfo() {
        System.out.println("High Temperature: " + highTemp + " " + tempScale);
        System.out.println("Low Temperature: " + lowTemp + " " + tempScale + "\n");
    }
}
