package com.nextbase.stepDefinitions;

import com.github.javafaker.Faker;
import com.nextbase.page.HomePage;
import com.nextbase.page.LoginPage;
import com.nextbase.utility.BrowserUtils;
import com.nextbase.utility.ConfigurationReader;
import com.nextbase.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;


import javax.security.auth.login.Configuration;

public class nextBase_StepDefinition {



    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User is logged in and on the home page")
    public void userIsLoggedInAndOnTheHomePage() {
        login.loginMethod(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }

    @When("User clicks on {string} tab")
    public void user_clicks_on_tab(String message) {
    //homePage.messageButton.click();
        homePage.tabClicker(message);
    }
    @When("User enter any {string} on the {string} field")
    public void user_enter_any_on_the_field(String text, String Message) {
        Driver.getDriver().switchTo().frame(homePage.messageFrame);
        BrowserUtils.sleep(1);

        Faker name = new Faker();
        String randommessage = name.name().name();
        homePage.messagebody.sendKeys(randommessage);

        Faker faker = new Faker();
        String fakerName  = faker.name().fullName();
        homePage.messagebody.sendKeys(fakerName);

        Driver.getDriver().switchTo().defaultContent();
        //faker class needed

    }
    @And("User able to click {string} button")
    public void userAbleToClickButton(String arg0) {
        homePage.sendBtn.click();
    }

    @Then("User able to click Cancel button")
    public void user_able_to_click_cancel_button() {
        homePage.messageButton.click();
        BrowserUtils.sleep(1);
        homePage.cancelBtn.click();
    }
    @When("User able to click link button")
    public void user_able_to_click_link_button() {
        homePage.linkBtn.click();
    }
    @When("User able to input Text")
    public void user_able_to_input_text() {
        BrowserUtils.sleep(2);
        homePage.textinput.sendKeys("orange");
    }
    @When("User able to input Link")
    public void user_able_to_input_link() {
        homePage.linkinput.sendKeys("www.gooogle.com");
    }
    @Then("User able to click Save button")
    public void user_able_to_click_save_button() {
        homePage.saveBtn.click();
        BrowserUtils.sleep(2);
    }
    @And("User write a {string} pollbox")
    public void userWriteAPollbox(String arg0) {
        homePage.pollquestionandtxt(arg0);
    }
    @And("User fills out the {string} box")
    public void userFillsOutTheBox(String arg0) {
        homePage.pollquestionandtxt(arg0);
    }
    @And("User clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        homePage.sendBtn.click();
    }
    @Then("poll should be visible in Activity Stream")
    public void pollShouldBeVisibleInActivityStream() {
        String expectedPollText = ConfigurationReader.getProperty("question");
        BrowserUtils.sleep(2);
        String actualPollText = homePage.pollTextCreated.getText();
        Assert.assertEquals(actualPollText,expectedPollText);
    }
    @And("User clicks selects answer box")
    public void userClicksSelectsAnswerBox() {
        BrowserUtils.sleep(1);
        homePage.firstAnsVote.click();
    }
    @Then("User clicks {string} button")
    public void userClicksButton(String arg0) {
        BrowserUtils.sleep(1);
       homePage.setVoteButton(arg0);
    }
    @Then("User able to see error message {string}")
    public void userAbleToSeeErrorMessage(String arg0) {
        String expectedErrorMessage = ConfigurationReader.getProperty("errorMsg");
        BrowserUtils.sleep(1);
        String actualErrorMessage = homePage.errorMessage.getText();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }
    @Then("User able to select {string}")
    public void userAbleToSelect(String arg0) {
        BrowserUtils.sleep(2);
        homePage.allowmultipleselect.click();
        homePage.allowmultipleselect.isSelected();
    }
    @And("User able to click Add question button")
    public void userAbleToClickAddQuestionButton() {
        homePage.addquestionbtn.click();
        homePage.addquestionbtn.isSelected();
        BrowserUtils.sleep(1);
    }
    @And("User able to click Send button")
    public void userAbleToClickSendButton() {
        homePage.sendBtn.click();
    }
    @When("User able to click Like button")
    public void userAbleToClickLikeButton() {
        homePage.likeButton.click();
        homePage.likeButton.isSelected();
    }
    @And("User able to follow a post by clicking {string} button")
    public void userAbleToFollowAPostByClickingButton(String arg0) {
        BrowserUtils.sleep(1);
        homePage.followButton.click();
        homePage.followButton.isSelected();
    }
    @And("User can see who are the people viewed a post with eye icon")
    public void userCanSeeWhoAreThePeopleViewedAPostWithEyeIcon() {
        BrowserUtils.sleep(1);
        homePage.eyeIcon.click();
        homePage.eyeIcon.isSelected();
    }
    @And("User able to click star icon to save a post as favorite")
    public void userAbleToClickStarIconToSaveAPostAsFavorite() {
        BrowserUtils.sleep(1);
        homePage.starIcon.click();
        homePage.starIcon.isSelected();
    }
    @And("User can write a comment to a post")
    public void userCanWriteACommentToAPost() {
        BrowserUtils.sleep(1);
        homePage.addCommentbox.click();
        Driver.getDriver().switchTo().frame(homePage.addiframe);
        homePage.commentBody.sendKeys("helloWorld");
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("User cancel a comment with {string} button")
    public void userCancelACommentWithButton(String arg0) {
        BrowserUtils.sleep(1);
        homePage.commentCancelBtn.click();
    }


    @When("user search valid info from search box {string},{string},{string},{string}")
    public void userSearchValidInfoFromSearchBox(String employees, String doc, String post, String task) {
        homePage.searchbox.sendKeys(employees);
        BrowserUtils.sleep(2);
        homePage.findEmployeeClick.click();
        BrowserUtils.sleep(1);

    }
    @When("user cannot find info, page should show {string}")
    public void user_cannot_find_info_page_should_show(String string) {
        BrowserUtils.sleep(2);
        homePage.searchbox.sendKeys("Ferrari" + Keys.ENTER);
        homePage.nothingFound.isDisplayed();

        String expected = "Nothing found";
        String actual = expected;

        Assert.assertTrue("Expected and Actual doesnt match",expected.equals(actual));

    }
    @Then("user gets {string},{string},{string},{string} when type a letter")
    public void user_gets_when_type_a_letter(String Employees, String Groups, String string, String search) {
        homePage.twentyFour.click();
        homePage.searchbox.sendKeys(Groups);
        BrowserUtils.sleep(2);
        homePage.displayMenuItems.isDisplayed();
        homePage.displayOther.isDisplayed();
        homePage.displaySearch.isDisplayed();
        homePage.displayMenuItems.getText();
        homePage.displayOther.getText();
        homePage.displaySearch.getText();
        //ok


    }


}


