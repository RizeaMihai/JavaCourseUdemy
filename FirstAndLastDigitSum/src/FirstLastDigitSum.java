public class FirstLastDigitSum {
    public static void main (String[] args) {
        System.out.println("sum is " + sumFirstAndLastDigit(252));
        System.out.println("sum is " + sumFirstAndLastDigit(257));
        System.out.println("sum is " + sumFirstAndLastDigit(0));
        System.out.println("sum is " + sumFirstAndLastDigit(5));
        System.out.println("sum is " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit (int number) {
        int lastD = number % 10;
        if (number < 0 ){
            return -1;
        }

        while (number > 9){
            number /= 10;
        }
        return number + lastD;
    }

}
