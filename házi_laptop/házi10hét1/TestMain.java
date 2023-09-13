
public class TestMain {
    public static void main(String args[])
    {
        teststringOsszegek();
    }

    public static void teststringOsszegek()
    {
        assert Main.stringOsszegek("66") == 12;
        assert Main.stringOsszegek("") == 0;
        assert Main.stringOsszegek("12") == 3;

        System.out.println("OK");
    }
}
