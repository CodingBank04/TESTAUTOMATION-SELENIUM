import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class NameLocator {

        static WebDriver beehive;

        public static void main (String [] args) {
            invokeChromeBrowser();
            beehive.get("https://www.facebook.com");
            beehive.findElement(By.name("firstname")).sendKeys("Mr");
            beehive.findElement(By.name("lastname")).sendKeys("peker");

        }
        public static void invokeChromeBrowser()
        {
            System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
            beehive = new ChromeDriver();
        }
    }

