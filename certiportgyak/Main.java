import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        QuadraticEquation e1 = new QuadraticEquation(5, -3, -2);

        //System.out.println(e1);
        //System.out.println("x1= "+e1.getRoot1());
        //System.out.println("x2= "+e1.getRoot2());

        Scanner sc = new Scanner(System.in);
        császár [] cs= new császár[10];
        int index = 0;
        String név;
        int szül_év;

        //while((szül_év=sc.nextInt()) != 0) {
        //    név = sc.next();
        //    cs[index++] = new császár(név, szül_év);
        //}

        császár min = cs[0];
        for(int i = 1; i < index; i++) {
            if(cs[i].getSzül_év() < min.getSzül_év()) {
                min = cs[i];
            }
        }

        //System.out.println(min);

        String [] token = "Java.asd.gg".split(".",0);
        for(int i = 0; i < token.length; i++) {
            System.out.println(token[i]);
        }

        String s1 = "Alma";
        String s2 = "Alma";
        String s3 = "Blma";
        String s4 = "Almi";
            String s5 = "Wellcome to Java";
    
        /*System.out.println(s1 + " " + s4);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.charAt(2));
        System.out.println(s1.contains("ma"));
        System.out.println(s1.indexOf("ma"));
        System.out.println(s1.indexOf("asd"));
        System.out.println(s1.length());
        System.out.println(s5.substring(0,10));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toLowerCase().replace('a', 'b'));
        System.out.println(s1.split("m"));
        }*/

        vendéglátóie [] vend = new vendéglátóie[4];

        vend[0] = new kocsma(new String[] {"Borsodi","Dankó","Absolut"}, "kaka", 20, true);
        vend[1] = new kocsma(new String[] {"Kőbambi","Lafi","Hubi"}, "Malac", 40, true);
        vend[2] = new kocsma(new String[] {"Helynekem","Bástya","Royal"}, "Pénisz", 30, true);
        vend[3] = new Étterem(new String[] {"marha","Kőbambi","csirke"}, "Comb", 30);
        vend[4] = new Étterem(new String[] {"sertés","Kőbambi","marha"}, "Eszel még", 50);
    }
    
}