package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "//*[@class='left-sidebar']")
    public WebElement homePageCategory;

@FindBy (xpath = "//*[@class='fa fa-lock']")
public WebElement signUpButton;

@FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginAccountText;

@FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement incorrectMailOrPassword;

@FindBy(xpath = "//*[@name='email'][1]")
    public WebElement emailBox;

@FindBy(xpath = "//*[@type='submit'][1]")
    public WebElement loginButton;

@FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;













}
