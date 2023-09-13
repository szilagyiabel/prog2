public class MyMath {

    private MyMath() {
        // nem lehet peladnoyistani
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }

}