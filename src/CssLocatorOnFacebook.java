import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssLocatorOnFacebook {
    public static void main(String[] args) {
        Browser myBrowser =new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowse();
        driver.get("https://facebook.com");
        //driver.findElement(By.cssSelector("input#email")).sendKeys("we want this");
   // driver.findElement(By.cssSelector("*=a:contains('Forgot account?')")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
       // driver.findElement(By.xpath("//a[@href^='abc']")).sendKeys("hellow world");
         driver.findElement(By.cssSelector("css=a:contains('fbIndex UIPage_LoggedOut _-kb sf _605a b_c3pyn-ahh chrome webkit mac x1 Locale_en_US cores-gte4 _19_u hasAXNavMenubar')")).click();


    }
}
