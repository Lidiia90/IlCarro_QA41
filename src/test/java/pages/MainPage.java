package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        setDriver(driver);
        driver.get("https://ilcarro.web.app/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public <T extends BasePage> T openTopMenu(String topMenuItem) {
        WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(), '" + topMenuItem + "')]"));
        menuItem.click();
        switch (topMenuItem) {
            case "LOGIN":
                return (T) new LoginPage(driver);
            case "SIGNUP":
                return (T) new SignupPage(driver);
            case "TermsOfUse":
                return (T) new TermsOfUsePage(driver);
            case "LetTheCarWork":
                return (T) new LetTheCarWorkPage(driver);
            case "SEARCH":
                return (T) new SearchPage(driver);

            default:
                throw new IllegalArgumentException("Somethings wrong" + topMenuItem);

        }
    }

    public SignupPage openSignupPage() {
        WebElement signupMenuItem = driver.findElement(By.xpath("//a[contains(text(), 'Sign up')]"));
        signupMenuItem.click();
        return new SignupPage(driver);
    }
}
