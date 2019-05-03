package com.sparta.vk.seleniumConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class seleniumConfig {


    public class SeleniumConfig
    {
        private WebDriver driver;
        private SeleniumPropertiesReader propertiesReader;

        public SeleniumConfig(String browser){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }

        public WebDriver getDriver()
        {
            return driver;
        }
    }
}
