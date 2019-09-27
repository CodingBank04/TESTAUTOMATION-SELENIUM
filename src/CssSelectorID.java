import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class CssSelectorID {
    public static void main(String [] args) throws InterruptedException {

        Browser myBrowser=new Browser();
         WebDriver driver =myBrowser.invokeChromeBrowse();
         driver.get("http://expedia.com");
         Thread.sleep(2000);

         driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
         Thread.sleep(2000);
         for (int i=0; i <4 ; i++) {
             Thread.sleep(1000);
             driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
         }
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

         driver.findElement(By.cssSelector("input[id='package-destination-hp-package'] ")).sendKeys("Los Angeles");
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("input#package-origin-hp-package[aria-owns='typeheadDataPlain']")).sendKeys("");
        driver.findElement(By.cssSelector("input#package-origin-hp-package[aria-owns='typeheadDataPlain']['text']")).sendKeys("");

    }

    }

