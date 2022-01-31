public class NumberToWords {

    public static void main (String[] args) {
        System.out.println("Reversed number is: " + reverse(10));
        System.out.println("The number of digits for: " + 10 + " is " + getDigitCount(10));
        numberToWords(10);

    }


    public static void numberToWords (int number) {

        int decimal;
        int rev = reverse(number);
        int difDigit = getDigitCount(number) - getDigitCount(rev);

        if ( number < 0) {
                System.out.println("Invalid Value");
        } else if (rev == 0) {
                System.out.println("Zero");
            }

        while (rev > 0) {
            decimal = rev % 10;
            rev /=  10;
            switch (decimal){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid value");
            }
        }

//        for (int i = 0; i < difDigit ; i++){
//            System.out.println("Zero");
//        }
        while (difDigit > 0) {
            System.out.println("Zero");
            difDigit --;
        }

    }

    public static int getDigitCount (int num) {
        int count = 0;
        if (num < 0){
            return -1;
        } else if (num == 0){
            return 1;
        }

        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    public static int reverse (int param) {
        int rev = 0;
        while (param != 0){
            int decimal = param % 10;
            rev *= 10;
            rev += decimal;

            param /= 10;
        }
        return rev;
    }
}
