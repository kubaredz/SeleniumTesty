import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondAutomatedClass {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kubar\\OneDrive\\Pulpit\\PracaInzynierska\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void mySecondTest() {
        driver.navigate().to("https://www.selenium.dev/");

        String title = driver.getTitle();

        Assert.assertTrue(title.equals("Selenium"));
    }

    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}