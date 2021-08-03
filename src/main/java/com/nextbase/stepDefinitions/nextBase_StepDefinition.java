package com.nextbase.stepDefinitions;

import com.nextbase.page.HomePage;
import com.nextbase.page.LoginPage;
import com.nextbase.utility.BrowserUtils;
import com.nextbase.utility.ConfigurationReader;
import com.nextbase.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.security.auth.login.Configuration;

public class nextBase_StepDefinition {

    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("User is logged in and on the home page")
    public void userIsLoggedInAndOnTheHomePage() {
        login.loginMethod(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }

    @When("User clicks on {string} tab")
    public void user_clicks_on_tab(String string) {
    homePage.messageButton.click();
    }
    @When("User enter any {string} on the {string} field")
    public void user_enter_any_on_the_field(String text, String Message) {
        Driver.getDriver().switchTo().frame(homePage.messageFrame);
        BrowserUtils.sleep(1);
        homePage.messagebody.sendKeys(text);
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User able to click Send button")
    public void userAbleToClickSendButton() {
        homePage.sendBtn.click();
    }
}