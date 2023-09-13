public class Oktató extends ember{
    private int oktatói_azon;

    public Oktató(int oktatói_azon, String név) {
        super(név);
        this.oktatói_azon = oktatói_azon;
    }

    public int getOktatói_azon() {
        return oktatói_azon;
    }

    public void setOktatói_azon(int oktatói_azon) {
        this.oktatói_azon = oktatói_azon;
    }
}
