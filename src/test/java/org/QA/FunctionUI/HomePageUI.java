package org.QA.FunctionUI;

import java.util.List;

import org.QA.Util.BaseClass;
import org.QA.page.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;


public class HomePageUI extends BaseClass {

	public PageObjectManager POM = new PageObjectManager(d);

	public static Logger log = Logger.getLogger(HomePageUI.class);

	public void goToHomeMenu() {
		LaunchBrowser("Chrome", "http://practice.automationtesting.in/");
		maximize();
		POM.getHomePage().getShopMenu().click();
		explicitWaitUntilVisible(POM.getHomePage().getHomeMenu());
		POM.getHomePage().getHomeMenu().click();
		implicitWait();
	}
	
	public void validateTheThreeSlider() {
		List<WebElement> noOfSliders = d.findElements(By.xpath("//div[@id='n2-ss-6']/div/div/div/div/div/img"));
		
		if(noOfSliders.size() == 3)
		{
			log.info("thus the presence of three Slider");
		}
		else {
			log.error("thus there are no three Slider");
		}
			
		
		
	}
	
}
