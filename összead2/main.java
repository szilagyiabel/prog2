package összead2;

public class main {
    public static void main(String[] args)
    {
        String s = "12398149874";
        int sum = 0;

        for(char c: s.toCharArray())
        {
            sum += (int)c -(int)'0';
        }

        System.out.println(sum);
    }
    
}
