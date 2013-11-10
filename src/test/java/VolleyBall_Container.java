import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VolleyBall_Container {
    private WebDriver driver;
    @Test
    public void launchVolleyballGui() {
        System.out.println("Hello world!");
        System.out.println("Done");
        System.out.println("changes on 4-Nov");
        System.out.println("changes on 5-Nov");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
}
