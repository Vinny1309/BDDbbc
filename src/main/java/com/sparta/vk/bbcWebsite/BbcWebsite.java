package com.sparta.vk.bbcWebsite;

import com.sparta.vk.bbcWebsite.pages.HomePage;
import com.sparta.vk.bbcWebsite.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class BbcWebsite {

    private WebDriver driver;

    public BbcWebsite(WebDriver driver){
        this.driver = driver;
    }

    public HomePage homePage(){
        return new HomePage(driver);
    }

    public RegistrationPage registrationPage(){
        return new RegistrationPage(driver);
    }

    public void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
