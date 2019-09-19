import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
    static WebDriver beehive;

    public static void main (String [] args) throws InterruptedException {
        String expectedValue="Sizin İçin Buradayız!";
        invokeChromeBrowser();
        beehive.manage().window().maximize();
        beehive.get("https://www.flypgs.com");

        beehive.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();

           Thread.sleep(2000);
           beehive.findElement((By.linkText("BİZE YAZIN"))).click();
           Thread.sleep(2000);
        System.out.println("Validation" + isTextTrue(expectedValue));




    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
        beehive = new ChromeDriver();
    }
    public static boolean  isTextTrue(String expectedValue){
        String resultValue=beehive.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return  resultValue.equals(expectedValue);
}
}
