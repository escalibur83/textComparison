public class GetLocalisationCod {

    public static String countryCod (String text)
    {
        String[] cod = text.split(" ", 2);
        String countryCod = cod [0];
        return countryCod;
    }
}
