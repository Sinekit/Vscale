package WebTest;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import ru.yandex.qatools.allure.annotations.Step;
import static WebTest.VscaleTest.driver;

public class Steps {
    VscaleObjects page = new VscaleObjects(driver);
    VscaleWaits wait = new VscaleWaits(driver);

    @Step ("Вход в панель")
    public void userLogin() {
        page.loginButton.click();
        page.loginField.sendKeys("45079");
        page.passwordField.sendKeys("x6NvXnM7CU");
        wait.simpleWait();
        page.loginButton.click();
    }
    @Step ("Заказ сервера")
    public void rentServer() {
        wait.animatedLoginLoader();
        wait.loginLoader();
        page.createServerButton.click();
        wait.createServerLoader();
        page.createServerButton.click();
    }
    @Step ("Проверка готовности")
    public void verificateServer() {
        page.gotoServersButton.click();
        driver.navigate().refresh(); //для обхода бага вечной установки сервера
        wait.readyStatus();
        String checkStatus = page.readyStatus.getText();
        Assert.assertEquals("Запущен", checkStatus);
    }
    @Step ("Открытие страницы сервера")
    public void choseServer() {
        page.serverTile.click();
    }
    @Step ("Удаление сервера")
    public void deleteServer() {
        page.menuDelete.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",page.checkbox);
        String serverName = page.deleteServerName.getText();
        page.captchaInput.sendKeys(serverName);
        page.deleteButton.click();
    }
    @Step ("Проверка удаления")
    public void deleteCheck() {
        wait.deleteStatus();
        String checkStatus = page.deleteStatus.getText();
        Assert.assertEquals("Удалён", checkStatus);
    }
}
