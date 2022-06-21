package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    By accountButton = By.xpath("/html/body/div[2]/section/header/div[1]/div/div[2]/div[1]/a");
    By registerButton = By.xpath("//*[@id=\"keyboard-nav-3\"]/div[2]/div[3]/a");
}
