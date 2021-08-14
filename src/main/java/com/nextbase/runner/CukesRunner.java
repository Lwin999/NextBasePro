package com.nextbase.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html: target/cucumber-report.html",
        features = "src/test/resources/feature",
        glue = "com/nextbase/stepDefinitions",
        dryRun = false,


        tags = ""


)
public class CukesRunner {
}
