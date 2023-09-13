package hazi6hét2;

public class Main {
    public static void main(String[] args) {
        String s = "90146852";
        int x = 0;

        for(char c: s.toCharArray())
        {
            x += (int)c - (int)'0';
        }

        System.out.println(x);
    }
}
