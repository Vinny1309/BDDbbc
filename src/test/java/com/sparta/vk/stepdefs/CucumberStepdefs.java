package com.sparta.vk.stepdefs;

import com.sparta.vk.bbcWebsite.BbcWebsite;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberStepdefs {

    private static BbcWebsite bbcWebsite;

    @Test
   @Given("I am on the registration page")
    public void given() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\VKapoor\\Documents\\chromedriver_win32\\chromedriver.exe");
       bbcWebsite = new BbcWebsite(new ChromeDriver());
       bbcWebsite.registrationPage().goToRegistrationPage();
       bbcWebsite.registrationPage().click13orAboveButton();
       bbcWebsite.registrationPage().enterDOB("13", "09", "1994");
       Thread.sleep(3000);
       bbcWebsite.registrationPage().clickContinueButton();
   }

   @Test
   @When("I input the necessary details with the password details {string}")
    public void when(String password){
       bbcWebsite.registrationPage().inputPassword(password);
   }

   @Test
   @Then("I receive the corresponding error {string}")
    public void then(String error){
       String errorMessage = bbcWebsite.registrationPage().getErrorMessage();
       Assert.assertEquals(errorMessage, error);
   }

   @AfterClass
    public static void quitDriver() throws InterruptedException {
       bbcWebsite.quitDriver();
   }
}
