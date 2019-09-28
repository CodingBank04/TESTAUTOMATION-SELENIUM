import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TryXpath
{
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowse();
        //driver.get("http://www.skyscanner.com");
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Java");

        driver.findElement(By.linkText("Effective Java")).click();

        //driver.findElement(By.xpath("//button[@type=\\'submit\\']")).click();
    }


}
