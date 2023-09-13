import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		    String line = br.readLine();

		    int x = 0;
		    int y = 0;

		    for (char c : line.toCharArray()) {
				if(c == 'v') {
					y--;
				}
				else if(c == '^') {
					y++;
				}
				else if(c == '>') {
					x++;
				}
				else if(c == '<') {
					x--;
				}
			}
		    System.out.println("("+x+", "+y+")");
		    System.out.println("Ebben az esetben az x = "+x+", y = "+y+".");

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