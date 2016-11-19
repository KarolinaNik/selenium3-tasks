import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created on 11/19/2016.
 */

public class aiTest {

    @Test
    public void testChrome ()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.co.uk");
        driver.quit();
    }
}
