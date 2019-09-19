import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocatorCW {

    public static WebDriver peker;
    public static void main(String args[]) throws InterruptedException {
        String expectedValue="Sizin İçin Buradayız!";
        invokeChromeBrowser();
        peker.manage().window().maximize();
        peker.get("http://www.flypgs.com");
        // Thread.sleep("")
        peker.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
        Thread.sleep(2000);
        peker.findElement(By.linkText("BİZE YAZIN")).click();
        Thread.sleep(2000);
        System.out.println("Validation"+isTextTrue(expectedValue));
    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");

        peker=new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue)
    {
        String resultValue=peker.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}
