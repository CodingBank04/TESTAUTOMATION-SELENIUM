import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {

        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowse();
        driver.get("https://www.expedia.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("package-departing-hp-package")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-year='2019'][data-month='9'][data-day='30']")).click();

    }
}
