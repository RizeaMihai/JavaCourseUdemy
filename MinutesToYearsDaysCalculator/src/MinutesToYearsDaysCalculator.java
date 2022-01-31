public class MinutesToYearsDaysCalculator {

    public static final String INVALID_MESAGE = "Invalid value";

    public static void main (String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-525600);

    }

    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long newDays = (days % 365);
            System.out.println(minutes + " min = " + years + " y and " + newDays + " d");
        }
    }
}
