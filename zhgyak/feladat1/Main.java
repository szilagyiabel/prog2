public class Main
{
    public static void main(String[] args)
    {
        String category ="";

        if(args.length == 0) {
            System.err.println("Hiba! Adjon meg egy kategóriát!");
            System.exit(1);
        } 
        else {
            for (int i = 0; i < args.length; i++) {
                if(i == 0) {
                    category = args[0];
                } 
                else {
                    category = category + " " + args[i];
                }
            }
        }

        List<Item> items = new ArrayList<Item>();

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("one.txt"));
            String line;
            
            while ((line = br.readLine()) != null)
            {
            	String[] parts = line.split(",");
                String termek = parts[0];
                String kategoria = parts[4];
                int mennyiseg = Integer.praseInt(parts[3]);

                if (kategoria.equals(category)) {
                    items.add(new Item(termek, kategoria, mennyiseg));
                }
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("nem talalhato file");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}