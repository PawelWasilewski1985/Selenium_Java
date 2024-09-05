package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waits;

public class AutomationExerciseHomePage {
    private WebDriver driver;
    private Waits waits;

    private By consentButton = By.xpath("//button[@aria-label='Consent']");
    private By mainLogo = By.xpath("//img[@src='/static/images/home/logo.png']");
    private By signUpLoginButton = By.xpath("//a[@href='/login']");

    public AutomationExerciseHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnConsentButton() {
        driver.findElement(consentButton).click();
    }

    public void clickOnSignUpLoginButton() {
        driver.findElement(signUpLoginButton).click();
    }

    public WebElement getMainLogo() {
        return driver.findElement(mainLogo);
    }

}
