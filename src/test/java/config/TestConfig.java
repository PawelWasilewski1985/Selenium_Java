package config;

import base.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestConfig {
    private WebDriver driver;
    private ApplicationURL applicationURL;

    // Method to initialize WebDriver based on the provided browser type
    public WebDriver startTest(String browser, String applicationURL) {
        driver = WebDriverManager.getDriver(browser);
        driver.get(applicationURL);
        driver.manage().window().maximize();
        return driver;
    }
    public void quitDriver() {
        WebDriverManager.quitDriver();
    }
}
