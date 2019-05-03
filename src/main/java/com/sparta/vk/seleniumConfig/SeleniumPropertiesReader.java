package com.sparta.vk.seleniumConfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class SeleniumPropertiesReader {
    private String chromeDriverPath;
    private String firefoxDriverPath;
    private String fileLocation = "resources/selenium.properties";

    public SeleniumPropertiesReader() {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader(fileLocation));
            chromeDriverPath = properties.getProperty("chromedriverpath");
            firefoxDriverPath = properties.getProperty("firefoxdriverpath");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public String getFirefoxDriverPath() {
        return firefoxDriverPath;
    }
}
