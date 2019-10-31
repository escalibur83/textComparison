import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;

public class OpenToChrome {

    public ArrayList<String> readToRealGame(String URL) throws InterruptedException, IOException {

        ReadToFile readToFile = new ReadToFile();
        ArrayList<String> cod = readToFile.();
        ArrayList<String> helpWithAllLang = new ArrayList();
        for (int i=0; i< 2; i++) //cod.size()
        {
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get(URL +"?" + cod.get(i));
            Thread.sleep(20000);
            WebElement infoButton = chromeDriver.findElement(By.xpath(".//*[@ class = \'active-element footer-icon footer-help-icon menu-help menu-disabling-sensitive\']"));
            infoButton.click();
            Thread.sleep(1000);
            WebElement infoText = chromeDriver.findElement(By.xpath(".//*[@ class = \"window-content\"]"));
            String textOfGames = infoText.getText();
            helpWithAllLang.add(i,textOfGames);
            System.out.println("Game load! lang="+cod.get(i) + " #" +i);
            Thread.sleep(500);
            chromeDriver.quit();
        }
        return helpWithAllLang;
    }
}