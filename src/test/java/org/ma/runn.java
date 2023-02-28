package org.ma;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/fe.feature",glue = "org.ma",monochrome = true,dryRun = false)
public class runn {

}
