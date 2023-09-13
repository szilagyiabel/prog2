package feladat3;

class StringUtils{
	public static boolean ispangram(String s) {
		
		s = s.toLowerCase();
		
		for (char c = 'a';c <= 'z'; c++) {
			if(!s.contains(String.valueOf(c))) {
				return false;
			}
		}
		return true;
	}
}