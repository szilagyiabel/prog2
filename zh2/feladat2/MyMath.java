public class MyMath {

    public static int factorial(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        }

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int pow(int szam, int kitevo) {

        if (szam < 0 || kitevo < 0) {
            return -1;
        }

        int result = 1;

        for (int i = 0; i < kitevo; i++) {
            result = result * szam;
        }

        return result;
    }
}