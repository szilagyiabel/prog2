public class TestMyMath {

    public static void main(String[] args) {

        givenNegativ();
        givenZero();
        givenPozitive();
        ///////////////////////////
        givenBothNegative();
        givenOneNegative();
        givenOneZero_returnsOne();
        givenOtherZero_returnsZero();
        givenBothZero_returnsOne();
        givenNormal();

    }

    ////// factorial

    public static void givenNegativ() {

        assert (MyMath.factorial(-5) == -1);
        assert (MyMath.factorial(-24) == -1);
        System.out.println("givenNegativ() ok");
    }

    public static void givenZero() {

        assert (MyMath.factorial(0) == 0);
        System.out.println("givenZero() ok");
    }

    public static void givenPozitive() {

        assert (MyMath.factorial(4) == 24);
        assert (MyMath.factorial(6) == 720);
        assert (MyMath.factorial(3) == 6);
        System.out.println("givenPozitive() ok");
    }

    ///////////////////// pow

    public static void givenBothNegative() {

        assert (MyMath.pow(-4, -3) == -1);
        assert (MyMath.pow(-42, -32) == -1);
        System.out.println("givenBothNegative() ok");
    }

    public static void givenOneNegative() {

        assert (MyMath.pow(12, -3) == -1);
        assert (MyMath.pow(-42, 6) == -1);
        System.out.println("givenOneNegative() ok");
    }

    public static void givenOneZero_returnsOne() {
        assert (MyMath.pow(12, 0) == 1);
        assert (MyMath.pow(42, 0) == 1);
        System.out.println("givenOneZero_retunsOne() ok");

    }

    public static void givenOtherZero_returnsZero() {

        assert (MyMath.pow(0, 4) == 0);
        assert (MyMath.pow(0, 23) == 0);
        System.out.println("givenOtherZero_returnsZero() ok");

    }

    public static void givenBothZero_returnsOne() {

        assert (MyMath.pow(0, 0) == 1);
        System.out.println("givenBothrZero_returnsOne() ok");

    }

    public static void givenNormal() {

        assert (MyMath.pow(2, 2) == 4);
        assert (MyMath.pow(1, 2) == 1);
        assert (MyMath.pow(3, 2) == 9);
        System.out.println("givenNormal() ok");

    }

}