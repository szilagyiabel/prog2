package feladat1;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Gamer123", "harcos");
        Player p2 = new Player("Hacker1", "mágus");
        Player p3 = new Player("Körte", "felderítő");

        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p2.getLevel());
        System.out.println(p2.increaseXp(2));
        System.out.println(p2.getLevel());
        System.out.println(p3.getCast());
        System.out.println(p1.compare(p2));
        System.out.println(p1.compare(p3));
        System.out.println(p2.compare(p1));
    }
}