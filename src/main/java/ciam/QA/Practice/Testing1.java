package ciam.QA.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		
		driver.get("");
		WebElement email = driver.findElement(By.id("email"));
		
	
		email.sendKeys("arvind");
		
		driver.navigate().refresh();
		
		email.sendKeys("ganga");
		
		
	}
	
	
	
	
}
