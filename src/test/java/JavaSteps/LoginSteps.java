package JavaSteps;

import LoginClass.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;
public class LoginSteps {

WebDriver driver = null;
LoginPage login;
    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("i am inside the browserbrowserbrowser=========");
        WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

    driver.manage().window().maximize();}

    @And("user is on login page")
    public void userIsOnLoginPage() {
driver.navigate().to("https://www.saucedemo.com/");
    }


    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        login = new LoginPage(driver);
        login.EnterUserName(username);
        login.EnterPassword(password);
        Thread.sleep(2000);


    }



    @And("user clicks on login")
    public voidD userClicksOnLogin() {
    login.ClickLogin();
        System.out.println("amendments in the code");
        System.out.println("jenkins practice");
    }

    @Then("user is navigate to home page")
    public void userIsNavigateToHomePage() throws InterruptedException {
        Assert.assertTrue(login.CheckProductSign());
Thread.sleep(2000);
driver.close();
    }



}

