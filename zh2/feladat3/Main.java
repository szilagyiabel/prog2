import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {

        System.out.print("Szöveg: ");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        HashMap<Character, Integer> betukMap = new HashMap<>();

        char[] betukArray = s.toCharArray();

        for (char c : betukArray) {
            if (betukMap.containsKey(c)) {
                betukMap.put(c, betukMap.get(c) + 1);
            } else {
                betukMap.put(c, 1);
            }
        }

        System.out.println("Karakterek és előfordulásuk:");

        for (Entry<Character, Integer> e : betukMap.entrySet()) {
            System.out.println("\t" + e.getKey() + ": " + e.getValue());
        }

    }
}