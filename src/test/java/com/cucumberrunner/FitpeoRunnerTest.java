package com.cucumberrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureFile",
        glue = "com/cucumberStepDefinition/pages",
        plugin = "html:src/test/rerun-features-report",
        tags = "@revenuePageValidation" )
public class FitpeoRunnerTest {

}
