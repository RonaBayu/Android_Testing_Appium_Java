package com.ronabayu.page;

import com.ronabayu.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class InboxPage extends BaseClass {
    private AppiumDriver<MobileElement> appiumDriver;

    public InboxPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver=appiumDriver;
    }

    By createChat = MobileBy.xpath("//android.view.ViewGroup[@index=\"4\"]");

    public void assertInboxPage(){
        appiumDriver.findElement(createChat).isDisplayed();
    }
}
