package parancssoriargumentum;

public class main {
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.exit(1);
        }
        int v1 = Integer.parseInt(args[0]);
        int v2 = Integer.parseInt(args[1]);
        System.out.println(v1 + v2);
    }

    
}
