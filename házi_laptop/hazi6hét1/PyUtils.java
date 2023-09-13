import java.util.Scanner;

public class PyUtils {
    public static String input(String out) {
        Scanner sc = new Scanner(System.in);
        System.out.print(out);
        String s = sc.nextLine();
        sc.close();
        
        return s;
    }

}
