package org.QA.page;

import org.QA.FunctionUI.HomePageUI;
import org.QA.Util.BaseClass;
import org.openqa.selenium.WebDriver;

public class PageObjectManager extends BaseClass {
	
	private HomePageElement HE;
	
	public PageObjectManager(WebDriver d){
		this.d = d;
		}

	
	public HomePageElement getHomePage() {
		return (HE == null) ? HE = new HomePageElement(d) : HE;
	}
	
}
