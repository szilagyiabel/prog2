public class Item {

    public String termek;
    public String kategoria;
    public int mennyiseg;

    public Item(String termek, String kategoria, int mannyiseg) {
        this.termek = termek;
        this.kategoria = kategoria;
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return termek + " (" + kategoria + "), " + mennyiseg + " db";
    }
}

