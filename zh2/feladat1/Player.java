package feladat1;

public class Player {

    private String name;
    private String cast;
    private double xp = 0;
    private double level = 1;

    public Player(String name, String cast) {
        setName(name);
        setCast(cast);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCast() {
        return cast;
    }
    public void setCast(String cast) {
        this.cast = cast;
    }
    public double getLevel() {
        return level;
    }

    public double compare(Player masik) {
        if (this.level > masik.level) {
            return 1;
        }else if(this.level == masik.level) {
            return 0;
        }else{
            return -1;
        }
    }

    public double increaseXp(int xp) {
        if(xp >= 2*level) {
            level++;
            return level;
        }
        else{
            return level;
        }
    }

    @Override
    public String toString() {
        return String.format("Level %.0f %s %s", level, cast, name);
    
    }
}