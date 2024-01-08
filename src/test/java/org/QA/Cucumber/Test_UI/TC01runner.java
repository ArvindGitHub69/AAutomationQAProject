package org.QA.Cucumber.Test_UI;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "D:\\SugiWorks\\workspace\\AAutomationQAProject\\src\\test\\java\\org\\QA\\Features\\",
dryRun = false,
glue = "org.QA.StepDefnition"		
		)
public class TC01runner {

}
