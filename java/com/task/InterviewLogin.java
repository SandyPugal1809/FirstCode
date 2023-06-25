package com.task;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		WebElement txtUserName = driver.findElement(By.name("username"));
	
		txtUserName.sendKeys("Admin");
		
		WebElement txtPassword = driver.findElement(By.name("password"));
	
		txtPassword.sendKeys("admin123");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
	
		btnLogin.click();
		
		Thread.sleep(2000);
		
		WebElement dashboarTxt = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[8]"));
		
		String txtMsgDisplay = dashboarTxt.getText();
		
		System.out.println(txtMsgDisplay);
		
		
		
	String expected="Dashboard";
	
	
	Assert.assertEquals("Verify text matched correctly",expected, txtMsgDisplay);
		
		
	}
	
	

}
