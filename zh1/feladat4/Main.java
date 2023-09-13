import java.util.List;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Hiba! Paraméterben egy fájlt adjon meg feldolgozásra!");
            System.exit(1);
        }

        String fname = args[0];
        int counter = 0;

        List<String> sorok = FileUtils.readLines(fname);

        String keresett = "A5:B8:F9";

        for (String sor : sorok) {
            if (sor.contains(keresett)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}