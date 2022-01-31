public class SharedDigit {
    public static void main (String[] args) {
        System.out.println("The numbers has shared digit: " + hasSharedDigit(12,23));
        System.out.println("The numbers has shared digit: " + hasSharedDigit(9,99));
        System.out.println("The numbers has shared digit: " + hasSharedDigit(15,55));
        System.out.println("The numbers has shared digit: " + hasSharedDigit(12,43));
    }

    public static boolean hasSharedDigit ( int first, int second){
        if ((first < 10 || first > 99) || (second < 10 || second >99)){
            return false;
        }
        int digit1 = first % 10;
        int digit2 = first / 10;
        int digit3 = second % 10;
        int digit4 = second / 10;

        if ((digit1 == digit3) || (digit1 == digit4) || (digit2 == digit3) || (digit2 == digit4)) {
            return true;
        }
        return false;
    }
}
