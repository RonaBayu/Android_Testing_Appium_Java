package com.ronabayu.page;

import com.ronabayu.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SignInPage extends BaseClass {
    private AppiumDriver<MobileElement> appiumDriver;

    public SignInPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver=appiumDriver;
    }

    By signInWithGoogleButton = MobileBy.xpath("//android.widget.TextView[@text=\"Sign in with Google\"]");

    public void clickSignInWithGoogleButton(){
        appiumDriver.findElement(signInWithGoogleButton).click();
    }
    public String getTextSignInWithGoogleButton(){
        return appiumDriver.findElement(signInWithGoogleButton).getText();
    }
}
