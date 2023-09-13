import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String file = "dobozok.txt";
		List<String> lines = FileUtils.readLines(file);
		
		int l = 0;
		int w = 0;
		int h = 0;
		int result = 0;
		
		for(String line : lines) {
			String[] sp = line.split("x");
			l = Integer.parseInt(sp[0]);
			w = Integer.parseInt(sp[1]);
			h = Integer.parseInt(sp[2]);
			result += 2*l*w + 2*w*h + 2*h*l;			
		}
		System.out.println(result+"m^2");
	}

}