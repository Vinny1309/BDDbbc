package com.sparta.vk;

import com.sparta.vk.bbcWebsite.BbcWebsite;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VKapoor\\Documents\\chromedriver_win32\\chromedriver.exe");
        BbcWebsite bbcWebsite = new BbcWebsite(new ChromeDriver());

        //bbcWebsite.homePage().goToHomePage().clickSignInLink().clickRegisterLink();


        bbcWebsite.registrationPage().goToRegistrationPage().click13orAboveButton();
        bbcWebsite.registrationPage().enterDOB("13", "09", "1994").clickContinueButton();
        Thread.sleep(2000);


        //bbcWebsite.registrationPage().click13orAboveButton();
        //bbcWebsite.registrationPage().goToRegistrationPage().click13orAboveButton();


        bbcWebsite.quitDriver();
    }
}
