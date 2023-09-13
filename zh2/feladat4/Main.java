package feladat4;

public class Main {

	public static void main(String[] args) {
		
		if(args.length == 1) {
			int dec = 0;
			int len = args[0].length();
			for (int i = 0; i < len; i++) {
				dec += Character.getNumericValue(args[0].toCharArray()[i]) * (int) Math.pow(2.0, len-i-1.0);
			}
			System.out.println(dec);
		}
		else {
			System.out.println("Hiba! Nem megfelelő számú argumentumot adott meg!");
		}
		
	}

}