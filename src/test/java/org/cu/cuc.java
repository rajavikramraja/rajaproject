package org.cu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.cu" , monochrome = true,dryRun = false
,tags = "@Feature1")

public class cuc {


}
