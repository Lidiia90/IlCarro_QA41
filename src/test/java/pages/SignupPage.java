package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SignupPage extends BasePage {

    @FindBy(xpath = "//input[@id='name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement LastNameField;

    @FindBy(xpath = "//input[@id='email']")
    WebElement EmailField;

    @FindBy(xpath = "//input[@id='password']")
    WebElement PasswordField;

    @FindBy(xpath = "//input[@id='terms-of-use']")
    WebElement checkBar;

    @FindBy(xpath = "//button[text()='Yalla!']")
    WebElement YallaButton;

    public SignupPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public SignupPage fillFirstNameField(String firstName){
        firstNameField.sendKeys(firstName);
        return this;
    }

    public SignupPage fillLastNameField(String lastName){
        LastNameField.sendKeys(lastName);
        return this;
    }

    public SignupPage fillEmailField(String email){
        EmailField.sendKeys(email);
        return this;
    }

    public SignupPage fillPasswordField(String password){
        PasswordField.sendKeys(password);
        return this;
    }

    public SignupPage clickByCheckBox(){
        checkBar.click();
        return this;
    }

    public void clickByYallaButton(){
        YallaButton.click();
    }
}

