package LoginClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_username = By.id("user-name");
    private By text_Password = By.id("password");
    private By Btn_Login = By.xpath("//*[@id=\"login-button\"]");
    private By Product_sign = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public LoginPage(WebDriver driver) {

this.driver=driver;
        if (!driver.getCurrentUrl().contains("saucedemo.com")){
    throw new IllegalStateException("this is not login page. The current page is "
           +driver.getCurrentUrl());
}
}

public void EnterUserName(String username){
        driver.findElement(txt_username).sendKeys(username);
}

    public void EnterPassword(String password){
        driver.findElement(text_Password).sendKeys(password);
    }

    public void ClickLogin(){
        driver.findElement(Btn_Login).click();
    }
public boolean CheckProductSign(){
        return driver.findElement(Product_sign).isDisplayed();
}

public void loginValidUser(String username,String password){
        driver.findElement(txt_username).sendKeys(username);
driver.findElement(text_Password).sendKeys(password);
    driver.findElement(Btn_Login).click();
    }




}
