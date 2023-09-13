public class TimeUtils {

	public static int convert(String s) {
		int ora = Integer.parseInt(s.split(":")[0]);
		int perc = Integer.parseInt(s.split(":")[1]);
		int mp = Integer.parseInt(s.split(":")[2]);
		return ora*3600 + perc*60 + mp;
	}
}