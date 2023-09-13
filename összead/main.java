package összead;

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Adjon meg egy számot: ");
       int input1 = Integer.parseInt(sc.nextLine());

       System.out.println("Adjon meg egy másik számot: ");
       int input2 = Integer.parseInt(sc.nextLine());
    }
}
