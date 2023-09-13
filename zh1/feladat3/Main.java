import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Adjon meg egy szöveget: ");

        String rawS = sc.nextLine();

        if (rawS.contains("good") && rawS.contains("bad")) {
            String result = rawS.replace("good", "tmp");
            result = result.replace("bad", "good");
            result = result.replace("tmp", "bad");

            System.out.printf("Kimenet %s\n", result);

        } else {
            System.out.printf("Kimenet: %s\n", rawS);
        }

        sc.close();


        //This apple is good, but this banana is soo bad.
    }

}