package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VscaleObjects {

    public VscaleObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[.='Войти']")
    public WebElement loginButton;
    @FindBy(name = "email_or_login")
    public WebElement loginField;
    @FindBy(name = "pass")
    public WebElement passwordField;
    @FindBy (xpath = "//button[contains(text(), 'Создать сервер')]")
    public WebElement createServerButton;
    @FindBy (xpath = "//button[contains(text(), 'ОК. Перейти к cерверам')]")
    public WebElement gotoServersButton;
    @FindBy (xpath = "//*[.='Запущен']")
    public WebElement readyStatus;
    @FindBy (className = "scalet-in")
    public WebElement serverTile;
    @FindBy (xpath = "//button[contains(text(),'Удалить')]")
    public WebElement deleteButton;
    @FindBy (xpath = "//*[.='Удалить']")
    public WebElement menuDelete;
    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement checkbox;
    @FindBy (xpath = "//div[@class='dialog-scalet-name ng-binding']")
    public WebElement deleteServerName;
    @FindBy (xpath ="//input[@class='ng-pristine ng-untouched ng-valid ng-empty']")
    public WebElement captchaInput;
    @FindBy (xpath = "//*[.='Удалён']")
    public WebElement deleteStatus;
    }

