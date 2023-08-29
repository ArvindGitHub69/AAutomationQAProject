package org.QA.TestNG.Test_UI;

import org.QA.Util.BaseClass;
import org.QA.page.MethodObjectManager;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TC1_Three_Slider_Only extends BaseClass {
	
	public MethodObjectManager MOM = new MethodObjectManager(d);
	
	
	
	@Test
	public void Three_Slider_Only() {
		test = extent.createTest("Check the Three sliders");
		MOM.getHomePage().goToHomeMenu();
		MOM.getHomePage().validateTheThreeSlider();
		test.log(Status.PASS, "Test Passed");
	}
}
