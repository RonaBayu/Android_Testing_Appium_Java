package com.appium.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/report/cucumber-report.html",
                "json:target/report/cucumber-report.json,"
        },
        features = {"src/test/resources/features"},
        glue = {"com/appium/stepDef","testRunner"},
//        tags = "@LogOut",
        monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests {


}

