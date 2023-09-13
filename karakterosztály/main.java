package karakterosztály;

public class main {
    public static void main(String[] args)
    {
        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isLowerCase('a'));
        System.out.println((char)9874);

        for(char c: "String".toCharArray())
        {
            System.out.println(c);
        }
    }
}
