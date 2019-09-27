import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class InvokeOperaBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver", "/Users/vahit.peker/Desktop/operadriver");
        WebDriver myDriver=new OperaDriver();
        myDriver.get("http://www.google.com");

    }


}
