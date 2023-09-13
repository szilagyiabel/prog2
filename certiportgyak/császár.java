public class császár {
    
    private String név;
    private int szül_év;

    public császár(String név, int szül_év) {
        this.név = név;
        this.szül_év = szül_év;
    }
    
    public int getSzül_év() {
        return szül_év;
    }

    public void setSzül_év(int szül_év) {
        this.szül_év = szül_év;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.név, this.szül_év);
    }
}
