import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ActionClassSendKeys {

    public static void main(String[] args) {

        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowse();
        driver.get("http://www.amazon.com");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Actions myAction = new Actions(driver);
       // myAction.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().perform();
        //myAction.sendKeys("shoes").perform();
       // myAction.moveToElement(driver.findElement(By.cssSelector("input[type='submit']"))).click().perform();
        WebElement myElement=driver.findElement(By.id("twotabsearchtextbox"));
        wait.until(ExpectedConditions.visibilityOf(myElement));
        Actions myMouse=new Actions(driver);
        myMouse.moveToElement(myElement).click().perform();
        myMouse.sendKeys("shoes").perform();
        myMouse.moveToElement(driver.findElement(By.cssSelector("input[type='submit']"))).click().perform();


    }
}