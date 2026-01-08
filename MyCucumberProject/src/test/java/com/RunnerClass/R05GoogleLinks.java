package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05GoogleLinks.feature",
					glue = "com.StepDef",
					tags = "@GoogleLinks",
					publish = true)
public class R05GoogleLinks {
	/*
	 * Execute Single Scenario		tags = "@AdvtLink"
	 * Execute Multiple Scenarios	tags = "@AdvtLink or @GmailLink"
	 * Skip Single Scenario			tags = "not @GmailLink"
	 * Skip Muliple Scenarios		tags = "not @GmailLink and not @AboutLink"
	 */

}
