package com.ronabayu.page;

import com.ronabayu.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ProfilePage extends BaseClass{

    private AppiumDriver<MobileElement> appiumDriver;
    public ProfilePage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver=appiumDriver;
    }

    By yourNameField = MobileBy.xpath("//android.widget.EditText[@index=\"1\"]");
    public void inputYourNameField(String keyword){
        appiumDriver.findElement(yourNameField).sendKeys(keyword);
    }
    public void clearYourNameField(){
        appiumDriver.findElement(yourNameField).clear();
    }
    public String getTextYourNameField(){
        return appiumDriver.findElement(yourNameField).getText();
    }
    By yourTitleField = MobileBy.xpath("//android.widget.EditText[@index=\"3\"]");
    public void inputYourTitleField(String keyword){
        appiumDriver.findElement(yourTitleField).sendKeys(keyword);
    }
    public void clearYourTitleField(){
        appiumDriver.findElement(yourTitleField).clear();
    }
    public String getTextYourTitleField(){
        return appiumDriver.findElement(yourTitleField).getText();
    }

    By yourBioField = MobileBy.xpath("//android.widget.EditText[@index=\"5\"]");
    public void inputYourBioField(String keyword){
        appiumDriver.findElement(yourBioField).sendKeys(keyword);
    }
    public void clearYourBioField(){
        appiumDriver.findElement(yourBioField).clear();
    }
    public String getTextYourBioField(){
        return appiumDriver.findElement(yourBioField).getText();
    }

    By saveButton = MobileBy.xpath("//android.widget.TextView[@text=\"SAVE\"]");
    public void clickSaveButton( ){
        appiumDriver.findElement(saveButton).click();
    }
    By successAlert = MobileBy.id("android:id/alertTitle");
    public String assertNotifGetText(){
        return appiumDriver.findElement(successAlert).getText();
    }
    By okAlertButton = MobileBy.id("android:id/button1");
    public void clickOkAlertButton(){
        appiumDriver.findElement(okAlertButton).click();
    }
}
