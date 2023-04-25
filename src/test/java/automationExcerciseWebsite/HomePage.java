package automationExcerciseWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(className = "logo")
    WebElement logo;


    public HomePage (WebDriver argDriver){
        this.driver = argDriver;
        driver.get("https://automationexercise.com/");
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogo(){
        logo.click();
    }
    public String getTitle(){
        return driver.getTitle();
    }
}
