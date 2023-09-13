import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String category = "";

        if (args.length == 0) {
            System.err.println("Hiba! Adjon meg egy kategóriát!");
            System.exit(1);
        } else {
            for (int i = 0; i < args.length; i++) {
                if (i == 0) {
                    category = args[0];
                } else {
                    category = category + " " + args[i];
                }
            }
        }

        List<Item> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("inventory.csv"))) {

            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");
                String termek = parts[0];
                String kategoria = parts[4];
                int mennyiseg = Integer.parseInt(parts[3]);

                if (kategoria.equals(category)) {
                    items.add(new Item(termek, kategoria, mennyiseg));
                }

            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl olvasásakor");
        }

        Collections.sort(items, new TermekComparator());

        for (Item item : items) {
            System.out.println(item);
        }

    }
}