import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
		try {
			String line;
		    BufferedReader br = new BufferedReader(new FileReader("time.txt"));

		    System.out.println("Opening input file ...");
		    System.out.println("Processing data ...");
		    PrintWriter writer = new PrintWriter("out.txt", "utf-8");
		    System.out.println("Create output file ...");

		    while ((line = br.readLine()) != null)
		    {
				writer.println(TimeUtils.convert(line));
		    }
		    br.close();
		    writer.close();
		}
		catch (FileNotFoundException e)
		{
		    System.err.println("nem talalhato file");
		}
		catch (IOException e)
		{
		    e.printStackTrace();
		}
		System.out.println("Finished!");
	}
}