public class Étterem extends vendéglátóie{
    private String [] étlap;

    public Étterem(String[] étlap, String név, int férőhelyek_száma) {
        super(név, férőhelyek_száma, false);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return super.toString() + "étlap" + étlap;
    }
}
