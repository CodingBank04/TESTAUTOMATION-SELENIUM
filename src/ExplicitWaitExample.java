import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

    public static void main(String[] args) {
        //My creation date : sept2019
        //ticket#32432424 ticket submit scenario
        Browser myBrowser= new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowse();
        driver.get("https://www.expedia.com");
        //set the timeout for explicit wait

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
        driver.findElement(By.id("tab-flight-tab-hp")).click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#tab-hotel-tab-hp"))));
        driver.findElement(By.id("tab-hotel-tab-hp")).click();

    //click bundle and save
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tab-package-tab-hp")));
       driver.findElement(By.id("tab-package-tab-hp")).click();






    }
}
