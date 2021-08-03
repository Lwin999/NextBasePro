package com.nextbase.page;

import com.github.javafaker.Faker;
import com.nextbase.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }





    @FindBy(xpath = "//span[.='Message']//span")
    public WebElement messageButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageFrame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messagebody;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

}


