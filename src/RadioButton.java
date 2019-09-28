import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowse();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        /*driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click(); */
        // I want to find the radio group buttons
        // I want to swtich between them using for loop
        int count = driver.findElements(By.cssSelector("input[type='radio']")).size();  // coutn willl be 3
        System.out.println("the number of radio button in group1 is :" + count);
        for (int i = 0; i < count; i++) {
            driver.findElements(By.cssSelector("input[type='radio']")).get(i).click();
            Thread.sleep(2000);


        }
    }
}





