package tests;

import config.ApplicationURL;
import config.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePageGoogle;
import utils.Assertions;

public class SeleniumGoogle {
    private WebDriver driver;
    private HomePageGoogle homePageGoogle;
    private Assertions assertions;
    private TestConfig testConfig;

    @BeforeClass
    @Parameters({"browser", "application"})
    public void setUp(@Optional("chrome") String browser, @Optional("GOOGLE") String application) {
        testConfig = new TestConfig();
        ApplicationURL appUrlEnum = ApplicationURL.valueOf(application.toUpperCase());
        String appUrl = appUrlEnum.getUrl();
        driver = testConfig.startTest(browser, appUrl);
        homePageGoogle = new HomePageGoogle(driver);
        assertions = new Assertions(driver);
    }

    @Test
    public void testMainLogoIsDisplayed() {
        homePageGoogle.clickOnAcceptedButton();
        assertions.assertElementIsDisplayed(homePageGoogle.getMainLogo());
    }

}




