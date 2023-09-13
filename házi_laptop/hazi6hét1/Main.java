
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String name = PyUtils.input("Neved: ");

        System.out.printf("Hello %s!\n", name);
    }
}