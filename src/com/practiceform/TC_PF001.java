package com.practiceform;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_PF001 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\OneDrive\\Desktop\\ShruthiAutomation\\chromedriver_win32\\chromedriver.exe");
		
		          ChromeDriver driver = new ChromeDriver();
		          
		          driver.get("https://demoqa.com/automation-practice-form");
		             driver.manage().window().maximize();
		
		       WebElement toolsQAHeader = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		       String toolsQAHeaderValue = toolsQAHeader.getText();
		       
		System.out.println(toolsQAHeaderValue);
		
           String practiceFormHeader = driver.findElement(By.xpath("//div[text()='Practice Form']")).getText();
System.out.println(practiceFormHeader);
		
	driver.findElement(By.id("uploadPicture")).click();
		
		Robot rb = new Robot();
		       
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
