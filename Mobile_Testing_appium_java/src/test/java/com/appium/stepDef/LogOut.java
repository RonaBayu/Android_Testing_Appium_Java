package com.appium.stepDef;

import com.ronabayu.base.BaseClass;
import com.ronabayu.page.HomePage;
import com.ronabayu.page.SideBar;
import com.ronabayu.page.SignInPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOut {
    public static AppiumDriver<MobileElement> appiumDriver = BaseClass.setUp();

    HomePage home = new HomePage(appiumDriver);
    SideBar sideBar = new SideBar(appiumDriver);
    SignInPage signInPage = new SignInPage(appiumDriver);
    @When("^User click hamburger icon$")
    public void userClickHamburgerIcon() {
        home.clickHamburgerIcon();
    }

    @And("^User click log out button$")
    public void userClickLogOutButton() {
        sideBar.clickLogOutButton();
    }

    @Then("^User is successfully logged out and showed sign in page$")
    public void userIsSuccessfullyLoggedOutAndShowedSignInPage() {
        String assertSignInButton = signInPage.getTextSignInWithGoogleButton();
        Assert.assertEquals(assertSignInButton,"Sign in with Google");
    }
}
