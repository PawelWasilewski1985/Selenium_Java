package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpLoginPage {
    private WebDriver driver;

    private By signUpStatement = By.xpath("//div[@class='signup-form']//h2");

    public SignUpLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignUpStatement() {
        return driver.findElement(signUpStatement);
    }


}
