package org.QA.page;

import org.QA.Util.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElement extends BaseClass {
	
	public HomePageElement(WebDriver driver) {
		this.d = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(.,'Shop')]")
	private WebElement shopMenu;
	
	@FindBy(xpath = "//a[contains(.,'Home')]")
	private WebElement homeMenu;
	
	@FindBy(xpath = "//div[@id='n2-ss-6']/div/div/div/div/div/img")
	private WebElement sliders;
	
	
	
	
	public WebElement getShopMenu() {
		return shopMenu;
	}
	public WebElement getHomeMenu() {
		return homeMenu;
	}
	public WebElement getSliders() {
		return sliders;
	}
	
}
