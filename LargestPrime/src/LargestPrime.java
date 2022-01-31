public class LargestPrime {
    public static void main (String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(2000000001));
    }

    public static int getLargestPrime (int number) {
        if (number > 1) {
            for (int x = number - 1; x >= 2; x--) {
                if (number % x == 0) {
                    number = x;
                }
            }
            return number;
        }
        return -1;
    }
}
