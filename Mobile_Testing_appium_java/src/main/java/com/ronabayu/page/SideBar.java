package com.ronabayu.page;

import com.ronabayu.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SideBar extends BaseClass {
    private AppiumDriver<MobileElement> appiumDriver;

    public SideBar(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver=appiumDriver;
    }

    By logOutButton = MobileBy.xpath("//android.widget.TextView[@text=\"Log Out\"]");
    public void clickLogOutButton(){
        appiumDriver.findElement(logOutButton).click();
    }
    By createCompanyButton = MobileBy.xpath("//android.widget.TextView[@text=\"Create Company\"]");
    public void clickCreateCompanyButton(){
        appiumDriver.findElement(createCompanyButton).click();
    }

    By companyName = MobileBy.xpath("//android.widget.TextView[@text=\"companyName\"]");
    public String assertCompanyName(){
      return appiumDriver.findElement(companyName).getText();
    }

}
