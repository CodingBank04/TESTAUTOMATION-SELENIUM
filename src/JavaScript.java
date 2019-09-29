import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class JavaScript {
    public static void main(String[] args)  {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowse();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[tpe=button]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedValue = "Are you sure you want to give us the deed to your house";
        ///if (1 == 1) {
        if(expectedValue.contains(driver.switchTo().alert().getText())){
            driver.switchTo().alert().accept();

        }
    }
}