import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MouseOverAction {
    public static void main(String[] args) {

    Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowse();
        driver.get("http://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions myMouse=new Actions(driver);

        myMouse.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2"))).build().perform();

}}
