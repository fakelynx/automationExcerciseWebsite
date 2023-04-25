package testCases;

import automationExcerciseWebsite.CartPage;
import automationExcerciseWebsite.SignupLoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UITests {

    WebDriver driver;
    SignupLoginPage objSignupLoginPage;

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
    }
    @AfterEach
    void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
