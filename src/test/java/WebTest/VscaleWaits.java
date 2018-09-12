package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static WebTest.VscaleTest.driver;

public class VscaleWaits {

    public VscaleWaits(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public WebDriverWait simpleWait () {
        new WebDriverWait(driver, 5);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait;
    }
    public WebElement loginLoader () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement LoginLoader = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='brand-loader']")));
        return LoginLoader;
    }
    public WebElement animatedLoginLoader () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement AnimatedLoginLoader = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='brand-loader is-animated']")));
        return AnimatedLoginLoader;
    }
    public WebElement createServerLoader () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement CreateServerLoader = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='loader-overlay pt40 ng-hide']")));
        return CreateServerLoader;
    }
    public WebElement readyStatus () {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement statusisReady = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Запущен']")));
        return statusisReady;
    }
    public WebElement deleteStatus () {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement statusisDeleted = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Удалён']")));
        return statusisDeleted;
    }
}