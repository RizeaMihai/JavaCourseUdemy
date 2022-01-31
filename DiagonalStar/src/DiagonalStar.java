public class DiagonalStar {
    public static void main (String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int nrRand = 1; nrRand <= number; nrRand++) {
                for (int nrCol = 1; nrCol <= number; nrCol++) {
                    if ((nrCol == nrRand) || (nrCol == 1 || nrRand == 1) || (nrCol == number || nrRand == number) || ((nrCol == number - nrRand + 1))) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }

    }

}
