import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("inventory.csv"))) {

            br.readLine();

            System.out.println("-> inventory.csv beolvasása");

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");
                String termek = parts[0];
                String kategoria = parts[4];
                int mennyiseg = Integer.parseInt(parts[3]);

                if (mennyiseg == 0) {
                    items.add(new Item(termek, kategoria, mennyiseg));
                }

            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl olvasásakor");
        }

        try (PrintWriter pw = new PrintWriter("out_of_stock.txt")) {
            System.out.println("-> out_of_stock.txt írása");

            for (Item item : items) {
                pw.println(item.toString());
            }

        } catch (IOException e) {
            System.err.println("Hiba a fájl írásakor");
        }

    }

}