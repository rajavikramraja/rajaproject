package org.inte;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources" ,glue="org.inte",monochrome = true,plugin = {"html:Report","junit:Report\\junitreport.xml","json:Report\\jsonreport.json"})
public class ru {

}
