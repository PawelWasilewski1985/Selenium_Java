package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageGoogle {
    private WebDriver driver;

    private By mainLogo = By.xpath("//picture/img");
    private By acceptedButton = By.xpath("//button[2]");

    public HomePageGoogle(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAcceptedButton() {
        driver.findElement(acceptedButton).click();
    }

    public WebElement getMainLogo() {
        return driver.findElement(mainLogo);
    }


}
