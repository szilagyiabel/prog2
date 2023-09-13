import java.io.*;

public class Main {

    public static void main(String[] args){

        if(args.length!=1){
            System.err.println("Error: provide the path of a directory!");
            System.exit(1);
        }
        File f = new File(args[0]);
        if(!f.isDirectory()) {
            System.err.println("Error: provide the path of a directory!");
            System.exit(1);
        }
     
        Bejar b = new Bejar();
        b.walk(args[0]);
        System.out.println("\nElkeszult");

    }
}
