import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelativeAbsoluteXpath {

    public static void main(String args[]) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowse();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys("Atlanta");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='hero-banner']/div/div/section/div/div[2]/div[2]/section[3]/form/section/div/div[2]/div/div/label/input")).sendKeys(" Las Vegas");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/label/child::input")).sendKeys("11/11/2019");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/label/child::input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(" //*[@id='package-departing-wrapper-hp-package']/div/div/div[1]/button/span//parent::button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='package-advanced-preferred-class-hp-package']/option[1]//parent::select")).click();
        //driver.findElement(By.xpath("//*[@id='search-button-hp-package']")).click();
    }

}