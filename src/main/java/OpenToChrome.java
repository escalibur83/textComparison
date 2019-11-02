import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class OpenToChrome {

    public static String readToRealGame(String URL, ArrayList<GoogleColumn> allColumn) throws InterruptedException, IOException {

        String textOfGames = "";
        for (GoogleColumn element : allColumn)
        {
            String code = element.code;
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get(URL +"?lang=" + code);
            Thread.sleep(20000);
            WebElement infoButton = chromeDriver.findElement(By.xpath(".//*[@ class = \'active-element footer-icon footer-help-icon menu-help menu-disabling-sensitive\']"));
            infoButton.click();
            Thread.sleep(1000);
            WebElement infoText = chromeDriver.findElement(By.xpath(".//*[@ class = \"window-content\"]"));
            textOfGames = infoText.getText();
            System.out.println("Game load! lang="+code+ " #");
            Thread.sleep(500);
            chromeDriver.quit();
            System.out.println(textOfGames);
            String[] splittedText = textOfGames.split("\\n");

            int index = 0;
            for (;index<element.googleText.size(); index++)
            {
                String textNew = element.googleText.get(index);

                if (index > splittedText.length - 1)
                {
                    // message
                    break;
                }
                String textOld = splittedText[index];

                diffMatchPatch obj = new diffMatchPatch();
                LinkedList<diffMatchPatch.Diff> difference = obj.diff_main(textOld, textNew);
                for (diffMatchPatch.Diff diffElement : difference)
                {
                    System.out.println(diffElement.toString());
                }

                int t = 0;
            }

        }
        return textOfGames;
    }
}