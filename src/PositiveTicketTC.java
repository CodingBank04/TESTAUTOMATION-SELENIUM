import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class PositiveTicketTC {
    public static void main(String[] args) throws InterruptedException {

        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowse();
        //driver.get("https://www.flypgs.com");
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"fligth-searh\"]/div[1]/div[1]/div/div[2]/div/label")).click();
        //driver.findElement(By.xpath("//label[@for='one_way']")).click();


        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("beehive");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).clear();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("Contains");
                   driver.findElement(By.xpath("//input[starts-with(@type,'ema')]")).sendKeys("starts with ema");


    }
}
