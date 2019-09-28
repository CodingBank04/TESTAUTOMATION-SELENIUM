import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowse();
        // Go to amazon
        driver.get("https://www.amazon.com");

        // Search porsche in amazon
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("java");
        driver.findElement(By.cssSelector("#nav-search-submit-text ~ input")).click();

        // Locator for unsponsored result headers
        By headerLocator = By.xpath("//span[@data-cel-widget='SEARCH_RESULTS-SEARCH_RESULTS']/div[1]/div[not(@data-component-type)]//h2//span");

        // wait for 5 seconds
        Thread.sleep(5000);

        // get unsponsored result count
        int resultCount = driver.findElements(headerLocator).size();

        // print unsponsored result count
        System.out.println("Total unsponspored results on page: " + resultCount);
    }
}
