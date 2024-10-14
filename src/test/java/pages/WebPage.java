package pages;
import static helper.Utility.driver;
import org.openqa.selenium.By;

public class WebPage {
    By input_username = By.id("user-name");
    By input_password = By.id("password");
    By login_button = By.id("login-button");
    By icon_cart = By.id("shopping_cart_container");

    public void openBrowser(){
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(input_password).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(login_button).click();
    }

    public void assertLoginPage(){
        driver.findElement(icon_cart).isDisplayed();
    }
}


