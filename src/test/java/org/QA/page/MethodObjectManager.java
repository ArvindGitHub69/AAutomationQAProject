package org.QA.page;

import org.QA.FunctionUI.HomePageUI;
import org.QA.Util.BaseClass;
import org.openqa.selenium.WebDriver;

public class MethodObjectManager extends BaseClass {
	private HomePageUI HE;
	
	public MethodObjectManager(WebDriver d){
		this.d = d;
		}

	
	
	public HomePageUI getHomePage() {
		return (HE == null) ? HE = new HomePageUI() : HE;
	}
}
