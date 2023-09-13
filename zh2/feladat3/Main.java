package feladat3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Szöveg: ");
		String s = sc.nextLine();
		
		if(StringUtils.ispangram(s)) {
			System.out.println("A fenti szöveg pangram!");
		}
		else {
			System.out.println("A fenti szöveg nem pangram!");
		}

	}

}