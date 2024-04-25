package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        Assert.assertTrue(automationExercisePage.homePageCategory.isDisplayed());
    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {

        automationExercisePage.signUpButton.click();

    }



    @Then("Quits")
    public void quits() {
        Driver.quitDriver();

    }

    @Then("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password(String aeInvalidEmail, String aeInvalidPassword) {

    automationExercisePage.emailBox.sendKeys(ConfigReader.getProperty("aeInvalidEmail"));
    actions.sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("aeInvalidPassword"))
            .perform();


    }
    @Then("Click {string} button")
    public void click_button(String string) {

        automationExercisePage.loginButton.click();

    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
   Assert.assertTrue(automationExercisePage.incorrectMailOrPassword.isDisplayed());

    }


    @And("Enter incorrect {string} address")
    public void enterIncorrectAddress(String invalidEmail) {
        automationExercisePage.emailBox.sendKeys(ConfigReader.getProperty(invalidEmail));
    }

    @And("Enter incorrect {string} password")
    public void enterIncorrectPassword(String inValidPassport) {

        automationExercisePage.passwordBox.sendKeys(ConfigReader.getProperty(inValidPassport));
    }
}
