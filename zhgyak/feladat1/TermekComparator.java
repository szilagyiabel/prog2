import java.util.Comparator;

public class TermekComparator implements Comparator<Item> {

    @Override
    public int compare(Item arg0, Item arg1) {
        return arg0.termek.compareTo(arg1.termek);
    }
}
