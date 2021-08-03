package com.nextbase.page;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (name = "USER_LOGIN")
    public WebElement usernameBox;

    @FindBy (xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;



    public void loginMethod (String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }




}
