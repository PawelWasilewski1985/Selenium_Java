package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    private WebDriver driver;

    public Waits(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Waits until the provided WebElement is visible on the page.
     *
     * @param element the WebElement to wait for
     * @param timeout the timeout in seconds
     * @return the WebElement after it becomes visible
     */
    public WebElement waitForElementToBeVisible(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits until the provided WebElement is clickable.
     *
     * @param element the WebElement to wait for
     * @param timeout the timeout in seconds
     * @return the WebElement after it becomes clickable
     */
    public WebElement waitForElementToBeClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Waits until the provided WebElement is invisible.
     *
     * @param element the WebElement to wait for
     * @param timeout the timeout in seconds
     * @return true if the element becomes invisible within the timeout, false otherwise
     */
    public boolean waitForElementToBeInvisible(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * Waits until the provided WebElement contains specific text.
     *
     * @param element the WebElement to wait for
     * @param text    the text to wait for
     * @param timeout the timeout in seconds
     * @return the WebElement after it contains the expected text
     */
    public Boolean waitForTextToBePresentInElement(WebElement element, String text, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}
