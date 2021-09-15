package ajax_mouse_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class Mouse_Handling extends DriverSetup {
	@Test
	public void AjaxMouseHandling() throws InterruptedException {
		
		//Navigate to the website
		driver.get("https://celtabroad.com");
		driver.manage().window().maximize();
		
		
		
		//University Handling
		Actions university = new Actions (driver);
		university.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div/div/div/nav/div/ul/li[1]/a"))).build().perform();
		Thread.sleep(2000);
		
		
		//Programs Handling
		Actions programs = new Actions (driver);
		programs.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div/div/div/nav/div/ul/li[2]/a"))).build().perform();
		Thread.sleep(2000);
		
		
		//Programs Handling
		Actions countries = new Actions (driver);
		countries.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div/div/div/nav/div/ul/li[3]/a"))).build().perform();
		Thread.sleep(2000);
		
		
		//Scholarship Handling
		Actions scholarship = new Actions (driver);
		scholarship.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div/div/div/nav/div/ul/li[4]/a"))).build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
