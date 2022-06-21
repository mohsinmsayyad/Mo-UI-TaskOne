package testcases;

import library.AlexNovaHomePage;
import library.SelectBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import java.time.Duration;

public class RegistrationPageTest {

    WebDriver driver;
    RegistrationPage registrationPage;
    AlexNovaHomePage alexNovaHomePage;

    @BeforeTest
    public void launchBrowser()
    {
        driver = SelectBrowser.StartBrowser("Chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.alexandnova.com/");
    }

    @Test(priority = 1)
    public void navigate_to_register_page(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        alexNovaHomePage = new AlexNovaHomePage();
        driver.findElement(By.xpath("/html/body/div[2]/section/header/div[1]/div/div[2]/div[1]/a"));

    }
}
