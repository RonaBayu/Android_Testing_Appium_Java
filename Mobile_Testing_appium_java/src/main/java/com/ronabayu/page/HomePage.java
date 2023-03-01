package com.ronabayu.page;

import com.ronabayu.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePage extends BaseClass{

    private AppiumDriver<MobileElement> appiumDriver;

    public HomePage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver=appiumDriver;
    }

    By iconHome = MobileBy.xpath("//android.widget.TextView[@text=\"Home\"]");
    public void clickIconHome(){
        appiumDriver.findElement(iconHome).click();
    }
    By iconProfile = MobileBy.xpath("//android.widget.TextView[@text=\"Profile\"]");
    public void clickIconProfile(){
        appiumDriver.findElement(iconProfile).click();
    }
    By iconInbox = MobileBy.xpath("//android.widget.TextView[@text=\"Inbox\"]");
    public void clickIconInbox(){
        appiumDriver.findElement(iconInbox).click();
    }
    By iconNotification = MobileBy.xpath("//android.widget.TextView[@text=\"Notification\"]");
    public void clickIconNotification(){
        appiumDriver.findElement(iconNotification).click();
    }

    By hamburgerIcon = MobileBy.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView");
    public void clickHamburgerIcon(){
        appiumDriver.findElement(hamburgerIcon).click();
    }

    By addNewHeadQuarter = MobileBy.xpath("//android.widget.TextView[@text=\"Add new Headquarter\"]");
    public void clickAddNewHeadQuarter(){
        appiumDriver.findElement(addNewHeadQuarter).click();
    }
    By addNewTeam = MobileBy.xpath("//android.widget.TextView[@text=\"Add new Team\"]");
    public void clickAddNewTeam(){
        appiumDriver.findElement(addNewTeam).click();
    }
    By addNewMembers = MobileBy.xpath("");
    public void clickAddNewMembers(){
        appiumDriver.findElement(addNewMembers).click();
    }
}
