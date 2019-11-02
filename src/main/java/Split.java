import java.util.Arrays;

public class Split {

    public static String split (String text)
    {
        String splittedText = (Arrays.toString(text.split("[.!?%]\\n")));
        return splittedText;
    }
}
