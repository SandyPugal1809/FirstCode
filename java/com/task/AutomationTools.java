package com.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTools {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	WebElement txtSearch = driver.findElement(By.id("APjFqb"));
	
	txtSearch.sendKeys("automationtools");
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
//	Thread.sleep(2000);
	
	WebElement clickTools = driver.findElement(By.xpath("//span[@class='PBBEhf']"));
	
	clickTools.click();
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	
	File file = new File("D:\\Screenshot\\Amazon images\\Tools.png");
	
	FileUtils.copyFile(screenshotAs, file);
	
	

	List<WebElement> listTools = driver.findElements(By.xpath("//div[@class='FZPZX q8U8x PZPZlf']"));
	
	for (WebElement webElement : listTools) {
		
		String text = webElement.getText();
		
		System.out.println(text);
	}
	
//	WebElement tools = driver.findElement(By.xpath("(//div[@jscontroller='GCSbhd'])"));
//	
//	System.out.println(tools.getText());
	
	List<WebElement> listTool = driver.findElements(By.xpath("//span[@class='z1asCe QFl0Ff']"));
	
	if (listTool.size()>=0) {
		
		for (WebElement webElement : listTool) {
			
			webElement.click();
			
			Thread.sleep(1000);
			
			List<WebElement> listAll = driver.findElements(By.xpath("//div[@class='Ze3gdf']"));
			
			for (WebElement webElement2 : listAll) {
				
				String text = webElement2.getText();
				
				System.out.println(text);
				
			}
			
		}
		
	} else {
		
		System.out.println("no tool is there");

	}
	
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	
	File screenshotAs2 = ts1.getScreenshotAs(OutputType.FILE);
	
	File file2 = new File("D:\\Screenshot\\Amazon images\\final.png");
	
	FileUtils.copyFile(screenshotAs2, file2);
	
	

//	
//	List<WebElement> imageAll = driver.findElements(By.xpath("//h3[text()='Description']"));
//	
//	for (WebElement webElement : imageAll) {
//		
//		String text = webElement.getText();
//		
//		System.out.println(text);
		
//	}
	
	}
}
