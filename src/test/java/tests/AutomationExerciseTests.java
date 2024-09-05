package tests;

import config.ApplicationURL;
import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AutomationExerciseHomePage;
import pages.HomePageGoogle;
import pages.SignUpLoginPage;
import utils.Assertions;

public class AutomationExerciseTests {
    private WebDriver driver;
    private AutomationExerciseHomePage automationExerciseHomePage;
    private Assertions assertions;
    private TestConfig testConfig;
    private String appUrl;
    private SignUpLoginPage signUpLoginPage;
    @BeforeClass
    @Parameters({"browser", "application"})
    public void setUp(@Optional("chrome") String browser, @Optional("AUTOMATIONEXERCISE") String application) {
        testConfig = new TestConfig();
        ApplicationURL appUrlEnum = ApplicationURL.valueOf(application.toUpperCase());
        appUrl = appUrlEnum.getUrl();
        driver = testConfig.startTest(browser, appUrl);
        automationExerciseHomePage = new AutomationExerciseHomePage(driver);
        assertions = new Assertions(driver);
        signUpLoginPage = new SignUpLoginPage(driver);
    }

    @Test
    public void registration() {
        automationExerciseHomePage.clickOnConsentButton();
        Assert.assertEquals(driver.getCurrentUrl(), appUrl);
        assertions.assertElementIsDisplayed(automationExerciseHomePage.getMainLogo());
        automationExerciseHomePage.clickOnSignUpLoginButton();
        assertions.assertTextContains(signUpLoginPage.getSignUpStatement(), "New User Signup!");

    }

}
