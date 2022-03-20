package com.telecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC002 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\vishn\\OneDrive\\Desktop\\ShruthiAutomation\\edgedriver_win64\\msedgedriver.exe");
		
        EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	     Thread.sleep(4000);
		
		 String mainHeader = driver.findElement(By.xpath("//div[text()='Practice Form']")).getText();

		String mainHeaderValue = "Practice Form";
		
		if(mainHeaderValue.equals(mainHeader))
		{
			System.out.println(mainHeader + " Header is displayed" );
		}else
		{
			System.out.println(mainHeader + " Header is not displayed");
		}
		
		
		 String firstNameTextbox = driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("placeholder");
		
		 String firstNameTextboxValue = "First Name";
		
		if(firstNameTextboxValue.equals(firstNameTextbox))
		{
			System.out.println(firstNameTextbox + " Textbox is displayed");
		}else
		{
			System.out.println(firstNameTextbox + " Textbox is not displayed");
		}
		
	String lastNameTextbox = driver.findElement(By.xpath("//input[@id='lastName']")).getAttribute("placeholder");
		
	String lastNameTextboxValue = "Last Name";
		
		if(lastNameTextboxValue.equals(lastNameTextbox))
		{
			System.out.println(lastNameTextbox + " Textbox is displayed");
		}else
		{
			System.out.println(lastNameTextbox + " Textbox is not displayed");
		}
		
	String emailTextbox = driver.findElement(By.xpath("//input[@id='userEmail']")).getAttribute("placeholder");
	String emailTextboxValue = "name@example.com";
		
		if(emailTextboxValue.equals(emailTextbox))
		{
			System.out.println(emailTextbox + " value is displayed");
		}else
		{
			System.out.println(emailTextbox + " value is not displayed");
		}
		
		String maleRadioButton = driver.findElement(By.xpath("//input[@value='Male']")).getAttribute("name");
		System.out.println("maleRadioButton is displayed");
		
		String femaleRadioButton = driver.findElement(By.xpath("//input[@value='Female']")).getAttribute("name");
		System.out.println("femaleRadioButton is displayed");
		
		String otherRadioButton = driver.findElement(By.xpath("//input[@value='Other']")).getAttribute("name");
		System.out.println("otherRadioButton is displayed");
		
		String mobileNumberTextbox = driver.findElement(By.xpath("//input[@id='userNumber']")).getAttribute("placeholder");
		String mobileNumberTextboxValue = "Mobile Number";
		
		if(mobileNumberTextboxValue.equals(mobileNumberTextbox))
		{
			System.out.println(mobileNumberTextbox + "Textbox is displayed");
		}else
		{
			System.out.println(mobileNumberTextbox + "Textbox is not displayed");
		}
		
		
		
	}
}
