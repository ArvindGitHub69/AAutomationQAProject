package org.QA.StepDefnition;

import org.QA.Util.BaseClass;
import org.QA.page.MethodObjectManager;
import org.QA.page.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_HomePage extends BaseClass {

	public PageObjectManager POM = new PageObjectManager(d);
	public MethodObjectManager MOM = new MethodObjectManager(d);

	@Given("The browser is launched")
	public void the_browser_is_launched() {
		LaunchBrowser("Chrome", "http://practice.automationtesting.in/");
		maximize();
	}

	@Given("navigated to the homepage")
	public void navigated_to_the_homepage() {
		POM.getHomePage().getShopMenu().click();
		explicitWaitUntilVisible(POM.getHomePage().getHomeMenu());
		
	}

	@When("then again navigated to shop menu")
	public void then_again_navigated_to_shop_menu() {
		POM.getHomePage().getHomeMenu().click();
		implicitWait();
	}

	@Then("validate the presence of three sliders")
	public void validate_the_presence_of_three_sliders() {
		MOM.getHomePage().validateTheThreeSlider();
		quit();
	}

}
