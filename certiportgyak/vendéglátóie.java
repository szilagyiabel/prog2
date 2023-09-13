public class vendéglátóie {
    private String név;
    private int férőhelyek_száma;
    private boolean dohányzó;
    
    public vendéglátóie(String név2, int férőhelyek_száma, boolean dohányzó) {
        this.név = név2;
        this.férőhelyek_száma = férőhelyek_száma;
        this.dohányzó = dohányzó;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getFérőhelyek_száma() {
        return férőhelyek_száma;
    }

    public void setFérőhelyek_száma(int férőhelyek_száma) {
        this.férőhelyek_száma = férőhelyek_száma;
    }
    
    public boolean isDohányzó() {
        return dohányzó;
    }

    public void setDohányzó(boolean dohányzó) {
        this.dohányzó = dohányzó;
    }

    @Override
    public String toString() {
        return "vendéglátóie név=" + név + ", férőhelyek_száma=" + férőhelyek_száma + ", dohányzó=" + dohányzó;
    }
    
}
