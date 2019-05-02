package com.sparta.vk.bbcWebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private final String homePageURL = "https://www.bbc.co.uk/";

    //Attributes of the page
    private final By signInLink = By.id("idcta-username");
    private final By registerLink = By.linkText("Register now");

    //news button

    //sport button

    //cbbc

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Behaviours of the page

    public HomePage goToHomePage(){
        driver.navigate().to(homePageURL);
        return this;
    }

    public HomePage clickSignInLink(){
        driver.findElement(signInLink).click();
        return this;
    }

    public HomePage clickRegisterLink(){
        driver.findElement(registerLink).click();
        return this;
    }

}
