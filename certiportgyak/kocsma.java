public class kocsma extends vendéglátóie{
    private String[] sörlap;

    public kocsma(String [] sörlap, String név, int férőhelyek_száma, boolean dohányzó) {
        super(név, férőhelyek_száma, dohányzó);
        this.sörlap = sörlap;
    }

    public String[] getSörlap() {
        return sörlap;
    }

    @Override
    public String toString() {
        return "kocsma sörlap =" + sörlap + " " + super.toString();
    }
}
