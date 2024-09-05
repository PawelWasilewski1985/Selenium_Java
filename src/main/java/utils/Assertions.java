package utils;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertions {
    private WebDriver driver;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }

    public void assertElementIsDisplayed(WebElement element) {
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed, "Element is not displayed: " + element.toString());
    }

    public void assertTextContains(WebElement element, String expectedText) {
        String actualText = element.getText();
        Assert.assertTrue(actualText.contains(expectedText),
                "Expected text '" + expectedText + "' not found in element text: '" + actualText + "'");
    }
}
