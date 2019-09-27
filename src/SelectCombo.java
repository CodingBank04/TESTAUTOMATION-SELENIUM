import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectCombo {
    public static void main (String [] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver beehive=myBrowser.invokeChromeBrowse();
        beehive.get("https://www.expedia.com");
        /*Thread.sleep(2000);
        beehive.findElement(By.id("package-advanced-preferred-class-hp-package")).click();
        Thread.sleep(2000);
        beehive.findElement(By.cssSelector("option[value='p']")).click();
        Thread.sleep(1000);
        beehive.findElement(By.cssSelector("option[value='p']")).sendKeys(Keys.ENTER);

         */
        Select s =new Select(beehive.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")));
        Thread.sleep(2000);
        s.selectByValue("p");
        Thread.sleep(1000);
        s.selectByIndex(0);
        Thread.sleep(1000);
        s.deselectByVisibleText("Business");
        Thread.sleep(1000);
       // s.deselectAll();

    }
}
