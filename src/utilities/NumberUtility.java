package utilities;

public class NumberUtility {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String s) {

        boolean parsable = true;
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            parsable = false;
        }
        return parsable;
    }

}
