package com.nextbase.stepDefinitions;

import com.nextbase.page.ClockPage;
import com.nextbase.page.HomePage;
import com.nextbase.utility.BrowserUtils;
import com.nextbase.utility.ConfigurationReader;
import com.nextbase.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.BrokenBarrierException;

public class ClockStepDefinition  {

        ClockPage clockPage = new ClockPage();
        HomePage homePage = new HomePage();
    @When("User clicks {string} tab")
    public void userClicksTab(String arg0) {
        clockPage.ClockInTab.click();
    }


//    @When("user can able to click {string} button")
//    public void user_can_able_to_click_button(String clockIn) {
//        Driver.getDriver().findElement(By.xpath("//span[.='Clock in']")).click();
//    }

    @When("user can edit Todays task under daily plan")
    public void userCanEditTodaysTaskUnderDailyPlan() {
        clockPage.todaysTaskTab.sendKeys("adding new functionalities");
        clockPage.todaysTAskSubmit.click();

    }
    @And("Should be able to add events")
    public void shouldBeAbleToAddEvents() {
        BrowserUtils.sleep(3);
        clockPage.eventTab.sendKeys("meeting at 1:00pm");

    }


    @Then("user edits work day starting and ending time")
    public void userEditsWorkDayStartingAndEndingTime() {
        homePage.CRM25button.click();
        BrowserUtils.sleep(1);
        clockPage.timeChangePencil.click();
        BrowserUtils.sleep(1);
        clockPage.increseTime.click();
        BrowserUtils.sleep(1);
        clockPage.textAreaReason.sendKeys("ending soon");
    }
}
