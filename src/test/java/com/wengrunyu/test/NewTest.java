package com.wengrunyu.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.net.URL;

public class NewTest {

    public AndroidDriver<WebElement> androidDriver;

    @Test
    public void f() {
        getElementAsync(By.id("com.meituan.sankuai.seagull:id/btn_choose_env")).click();
    }

    public WebElement getElementAsync(final By by) {
        WebDriverWait webDriverWait = new WebDriverWait(androidDriver, 30);
        WebElement webElement = webDriverWait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver input) {
                return androidDriver.findElement(by);
            }
        });
        return webElement;
    }

    @BeforeClass
    public void beforeClass() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "");
        desiredCapabilities.setCapability("platformName", "");
        desiredCapabilities.setCapability("appPackage", "");
        desiredCapabilities.setCapability("appActivity", "");

        androidDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }

    @AfterClass
    public void afterClass() {

    }
}
