package WebTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class VscaleTest {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://vscale.io/");
    }

    @Test
    @DisplayName("ControlPanel")
    public void ControlPanel() {
        Steps step = new Steps();
        step.userLogin();
        step.rentServer();
        step.verificateServer();
        step.choseServer();
        step.deleteServer();
        step.deleteCheck();
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}
