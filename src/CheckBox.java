import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowse();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).click();
        Thread.sleep(2000);
        System.out.println("is selected " +driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).isSelected());
        Thread.sleep(2000);
    }



}
