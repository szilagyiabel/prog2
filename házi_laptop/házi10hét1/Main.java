

public class Main
{
    //1. mo.: adott_c - '0' => vissza adja a szamot char-kent
    //2. mo.:
    public static int stringOsszegek(String s)
    {
        int sum = 0;
        for (char c : s.toCharArray())
        {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }
    public static void main(String[] args)
    {
        String s = "90146852";
        System.out.println(stringOsszegek(s));
    }
}