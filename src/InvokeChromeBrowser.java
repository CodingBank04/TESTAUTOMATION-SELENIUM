import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeBrowser {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
        WebDriver myDriver=new ChromeDriver();
        myDriver.get("http://www.google.com");
        //myDriver.close();




    }
}
