package stepDefs;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps {
    public WebDriver driver;
    public LoginPage lp;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C://Users//Tech Jargon//Documents//TestAutomation//GmailTests//ChromeDriver/chromedriver.exe");
        driver=new ChromeDriver();
        lp = new LoginPage(driver);
    }
    @When("I open gmail login page")
    public void i_open_gmail_login_page() {
        driver.get("https://accounts.google.com/");
    }
    @And("I enter my email address as {string}")
    public void iEnterMyEmailAddressAs(String email) {
        lp.setEmail(email);
    }

    @And("I click next button")
    public void iClickNextButton() {
        lp.clickNext();
    }

    @And("I enter my password as {string}")
    public void iEnterMyPasswordAs(String pwd) {
        lp.setPassword(pwd);
    }

    @Then("I am redirected to my inbox with name as {string}")
    public void iAmRedirectedToMyInboxWithNameAs(String name) {
        if (driver.getPageSource().contains("Your password was changed")){
            driver.close();
            Assert.assertTrue(false);
        }else {
            Assert.assertEquals(name,driver.getTitle());
        }
    }
    @Then("I Close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
