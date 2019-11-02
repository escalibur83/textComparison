import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {

    public static void main (String[] args) throws IOException, GeneralSecurityException {
        SheetsQuickstart sheetsQuickstart = new SheetsQuickstart();
        sheetsQuickstart.readAllDocument("1vpgDfJi0mjvZ8amZ3P9MKjifnbN-11cnDmm6CtRluOE", "Help Desktop", 'B');
    }
}
