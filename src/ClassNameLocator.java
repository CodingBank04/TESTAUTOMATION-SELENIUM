import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator
{
    public static WebDriver beehive;

    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        beehive.get("https://www.turkishairlines.com");
        Thread.sleep(2000);
        beehive.findElement(By.className("thyHeaderLink")).click();
    }


    public static void invokeChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
        beehive = new ChromeDriver();
    }
}