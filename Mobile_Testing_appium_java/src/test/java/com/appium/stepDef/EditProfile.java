package com.appium.stepDef;

import com.ronabayu.base.BaseClass;
import com.ronabayu.page.HomePage;
import com.ronabayu.page.ProfilePage;
import com.ronabayu.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import static com.ronabayu.base.BaseClass.driver;


public class EditProfile {

    public static AppiumDriver<MobileElement> appiumDriver = BaseClass.setUp();

    HomePage dashboard = new HomePage(appiumDriver);
    ProfilePage profilePage = new ProfilePage(appiumDriver);

    @Given("^User already opened Staging Cicle app$")
    public void userAlreadyOpenStagingCicleApp() {
        System.out.println("Opening the app...........");
    }

    @When("^User click icon profile on footer dashboard page$")
    public void userClickIconProfileOnFooterDashboardPage() {
            dashboard.clickIconProfile();
    }

    @And("^User input ([^”]*) on Your Name field$")
    public void userInputNewNameOnYourNameField(String name) {
        profilePage.clearYourNameField();
        profilePage.inputYourNameField(name);
    }

    @And("^User input ([^”]*) on Your Title field$")
    public void userInputNewTitleOnYourTitleField(String title) {
        profilePage.clearYourTitleField();
        profilePage.inputYourTitleField(title);
    }

    @And("^User input ([^”]*) on Your Bio field$")
    public void userInputNewBioOnYourBioField(String bio) {
        profilePage.clearYourBioField();
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_TIME, TimeUnit.SECONDS);
        profilePage.inputYourBioField(bio);
    }

    @And("^User click save button$")
    public void userClickSaveButton() {
        profilePage.clickSaveButton();
    }

    @Then("^The app shows success message and changing profile$")
    public void theAppShowsSuccessMessageAndChangingProfile() {
        String allertMessage= profilePage.assertNotifGetText();
        Assert.assertEquals(allertMessage,"Success");

        profilePage.clickOkAlertButton();

        String nama = profilePage.getTextYourNameField();
        Assert.assertEquals(nama,"Kepa");

        String title = profilePage.getTextYourTitleField();
        Assert.assertEquals(title,"QA Engineer");

        String bio = profilePage.getTextYourBioField();
        Assert.assertEquals(bio, "New QA");
    }
}
