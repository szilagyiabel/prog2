package házi3hét1;

public class hamming {
    public String s1;
    public String s2;
    public int c;

    public hamming(String s1, String s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int len()
    {
        if (s1.length()  != s2.length())
        {
            return -1;
        }
        else
        {
            for (int i = 0; i < s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    c++;
                }
            }
        }
        return c;
    }
}
