package com.nextbase.page;


import com.nextbase.utility.ConfigurationReader;
import com.github.javafaker.Faker;

import com.nextbase.utility.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//body[@contenteditable='true'][1]")
    public WebElement messagebody;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelBtn;

    @FindBy(id= "bx-b-link-blogPostForm")
    public WebElement linkBtn;

    @FindBy(xpath = "//input[@placeholder='Link text']")
    public WebElement textinput;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkinput;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[@class='logo-text']")
    public WebElement CRM25button;

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement accountButton;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement LogoutBtn;

    @FindBy(xpath = "//span[.='Poll']")
    public WebElement pollbtn;

    @FindBy(xpath = "//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")
    public WebElement questionbox;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement answer1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement answer2;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement polltextbox;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe'][1]")
    public WebElement polliframe;

    @FindBy(xpath = "//div[@class='bx-vote-question-title']")
    public WebElement pollTextCreated;


    @FindBy(xpath = "//span[.='Yes, I am an SDET'][1]")
    public WebElement firstAnsVote;

    @FindBy(xpath = "//button[.='Vote'][1]")
    public WebElement voteButton;

    public void setVoteButton(String voteTab){
        Driver.getDriver().findElement(By.xpath("//button[.='"+voteTab+"']")).click();

            }

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@id='multi_0']")
    public WebElement allowmultipleselect;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addquestionbtn;


    public void tabClicker(String tabName){
        Driver.getDriver().findElement(By.xpath("//span[.='"+tabName+"']")).click();
    }
    public void sendOrCancel(String buttonName){
        Driver.getDriver().findElement(By.xpath("//button[.='"+buttonName+"']")).click();
    }

    public void pollquestionandtxt(String str){
        switch(str){
            case "Question":
                questionbox.sendKeys(ConfigurationReader.getProperty("question"));
                break;
            case "Answer1":
                answer1.sendKeys(ConfigurationReader.getProperty("answer1"));
                break;
            case "Answer2":
                answer2.sendKeys(ConfigurationReader.getProperty("answer2"));
                break;
        }
    }

}


