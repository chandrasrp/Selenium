package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//This is constructor
public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setusername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setpassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
