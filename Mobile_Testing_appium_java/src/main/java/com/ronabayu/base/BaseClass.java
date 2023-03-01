package com.ronabayu.base;

import com.ronabayu.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriver<MobileElement> driver = null;
    public static DesiredCapabilities caps;
    public static Properties properties;

    public BaseClass(){
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/com/ronabayu/config/config.properties");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @BeforeClass
    public static AppiumDriver<MobileElement> setUp() {
        try {
            caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "11");
            caps.setCapability("deviceName", "4810d6ca");
            caps.setCapability("appPackage", "staging.cicle");
            caps.setCapability("appActivity", "staging.cicle.MainActivity");
//            caps.setCapability("app","/dir");
            caps.setCapability("noReset", "true");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<>(url, caps);

            driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_TIME, TimeUnit.SECONDS);
            driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 40);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }

    @AfterClass
    public static void tearDown(){
//        driver.quit();
        driver.closeApp();
    }
}
