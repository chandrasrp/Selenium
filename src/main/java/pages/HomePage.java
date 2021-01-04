package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        cliclLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        cliclLink("Dropdown");
        return new DropdownPage(driver); //returns the new class passing in the driver
    }

    private void cliclLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
