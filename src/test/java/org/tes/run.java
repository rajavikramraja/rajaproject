package org.tes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/amaz.feature",glue = {"org.cucum","org.hook"},monochrome = true,dryRun = false,snippets = SnippetType.CAMELCASE,strict = false)
public class run {

}
