package com.sparta.vk.bbcWebsite.pages;

import net.bytebuddy.implementation.bind.annotation.Morph;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private WebDriver driver;

    private String registrationPageURL = "https://account.bbc.com/register";
    private By userField = By.id("user-identifier-input");
    private By thirteenOrAbove = By.linkText("13 or over");
    private By dobDay = By.id("day-input");
    private By dobMonth = By.id("month-input");
    private By dobYear = By.id("year-input");
    private By continueRegistrationButton = By.id("submit-button");
    private By passwordField = By.id("password-input");
    private By emailField = By.id("user-identifier-input");
    private By postcodeInput = By.id("postcode-input");
    private By passwordErrorMessage = By.id("form-message-password");


    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement findElement(By element){
        return driver.findElement(element);
    }

    public RegistrationPage goToRegistrationPage(){
        driver.navigate().to(registrationPageURL);
        return this;
    }

    public void click13orAboveButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(thirteenOrAbove).click();
    }

    public RegistrationPage enterDOB(String day, String month, String year){
        findElement(dobDay).sendKeys(day);
        findElement(dobMonth).sendKeys(month);
        findElement(dobYear).sendKeys(year, Keys.TAB);
        return this;
    }


    public void clickContinueButton() {
        findElement(continueRegistrationButton).click();
    }


    public RegistrationPage inputEmail(String email){
        findElement(emailField).sendKeys(email);
        return this;
    }

    public RegistrationPage inputPassword(String password){
        findElement(passwordField).sendKeys(password, Keys.ENTER);
        return this;
    }

    public RegistrationPage inputPostcode(String postcode){
        findElement(postcodeInput).sendKeys(postcode);
        return this;
    }

    public String getErrorMessage(){
        return findElement(passwordErrorMessage).getText();
    }

}
