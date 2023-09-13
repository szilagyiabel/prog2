package házi3hét3;

public class FizzBuzz {
    public static int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public static void buzzing()
    {
        for(int i = 0; i < n; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else 
            {
                System.out.println(i);
            }
        }
    } 
}
