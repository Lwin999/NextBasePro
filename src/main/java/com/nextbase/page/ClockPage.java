package com.nextbase.page;

import com.nextbase.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClockPage extends BasePage{

    @FindBy(xpath = "//span[@id='timeman-status']")
    public WebElement ClockInTab;

    public void ClockIn(){
        Driver.getDriver().findElement(By.xpath("//span [.='Clock in']")).click();
    }

    @FindBy(xpath = "//input[@class='tm-popup-task-form-textbox']")
    public WebElement todaysTaskTab;

    @FindBy(xpath = "//span[@class='tm-popup-task-form-submit']")
    public WebElement todaysTAskSubmit;

    @FindBy(xpath = "//input[@class='tm-popup-event-form-textbox_am_pm']")
    public WebElement eventTab;

    @FindBy(xpath = "//span[@class='tm-popup-event-form-submit']" )
    public WebElement eventSubmitPlus;

    @FindBy(xpath = "//span[@class='tm-popup-notice-pencil']")
    public WebElement timeChangePencil;

    @FindBy(xpath = "(//input[@class='bxc-cus-sel']/following::td)[1]")
    public WebElement increseTime;

    @FindBy(xpath = "(//div[@class='bx-tm-popup-clock-wnd-report'])[2]/textarea")
    public WebElement textAreaReason;


}
