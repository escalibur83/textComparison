import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) throws IOException, GeneralSecurityException, InterruptedException {
        ArrayList<GoogleColumn> allColumn = new ArrayList<GoogleColumn>();
        SheetsQuickstart.readAllDocument("1vpgDfJi0mjvZ8amZ3P9MKjifnbN-11cnDmm6CtRluOE", "Unregulated Help Desktop", 'B', allColumn);
        OpenToChrome.readToRealGame("http://gc.gaming.skywindgroup.com/lastkingdom/develop/454/index.html", allColumn);
    }
}