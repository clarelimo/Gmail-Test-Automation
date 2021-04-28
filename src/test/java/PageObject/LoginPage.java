package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(id = "identifierId")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")
    @CacheLookup
    WebElement nextButton;

    @FindBy(className ="whsOnd zHQkBf" )
    @CacheLookup
    WebElement password;

    public  void setEmail(String email){
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void  setPassword(String pwd){
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickNext(){
        nextButton.click();
    }
}
