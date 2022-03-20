package com.telecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\vishn\\OneDrive\\Desktop\\ShruthiAutomation\\edgedriver_win64\\msedgedriver.exe");
		
           EdgeDriver driver=new EdgeDriver();
           
           driver.get("https://demo.guru99.com/");
           
           driver.manage().window().maximize();
           
           driver.navigate().refresh();
           
           Thread.sleep(6000);
           
         WebElement telecomProjectLink = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
            telecomProjectLink.click();
       
        Thread.sleep(6000);
           
        WebElement addCustomerLink = driver.findElement(By.xpath("(//a[contains(text(),'Add Customer')])[1]"));
             String addCustomer=addCustomerLink.getText();
             System.out.println(addCustomer);
                   
               WebElement  addCustomerText = driver.findElement(By.xpath("(//p)[1]"));
               String addCustomerTextvalue=addCustomerText.getText();
               System.out.println(addCustomerTextvalue);
              
              addCustomerLink.click();
             
              Thread.sleep(8000);
              
            WebElement guru99TelecomLogo = driver.findElement(By.xpath("//a[text()='Guru99 telecom']"));
               String  guru99Telecom=guru99TelecomLogo.getText();
               System.out.println(guru99Telecom);
              
            WebElement addCustomerHeader = driver.findElement(By.xpath("//h1"));
            String addCustomerHeadervalue = addCustomerHeader.getText();
              System.out.println(addCustomerHeadervalue);
        
           WebElement backgroundCheckHeader = driver.findElement(By.xpath("//h3[contains(text(),'Background')]"));     
           String backgroundCheckHeaderValue = backgroundCheckHeader.getText();
           System.out.println(backgroundCheckHeaderValue);
           
            WebElement  doneRadioButton = driver.findElement(By.xpath("//label[text()='Done']"));
          String doneRadioButtonValue = doneRadioButton.getText();
            System.out.println(doneRadioButtonValue);
            
          WebElement pendingRadioButton = driver.findElement(By.xpath("//label[@for='pending']"));
            String pendingRadioButtonValue = pendingRadioButton.getText();
            System.out.println(pendingRadioButtonValue);
        
          WebElement billingAddressHeader = driver.findElement(By.xpath("//h3[contains(text(),'Billing')]"));
          String billingAddressHeaderValue = billingAddressHeader.getText();
          System.out.println(billingAddressHeaderValue);
           
          WebElement firstNameTextbox = driver.findElement(By.xpath("//input[@placeholder='FirstName']"));
          String firstNameTextboxValue = firstNameTextbox.getText();
          System.out.println(firstNameTextboxValue);
          
         WebElement lastNameTextbox = driver.findElement(By.xpath("//input[@placeholder='LastName']"));         
         String lastNameTextboxValue = lastNameTextbox.getText();
          System.out.println(lastNameTextboxValue);
          
        WebElement emailTextbox = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        String emailTextboxValue = emailTextbox.getText();
          System.out.println(emailTextboxValue);
          
        WebElement addressTextbox = driver.findElement(By.xpath("//textarea"));
        String addressTextboxValue = addressTextbox.getText();
          System.out.println(addressTextboxValue);
          
        WebElement mobileNumberTextbox = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        String mobileNumberTextboxValue = mobileNumberTextbox.getText();
        System.out.println(mobileNumberTextboxValue);
        
      WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
      String submitButtonValue = submitButton.getText();
      System.out.println(submitButtonValue);
        
    WebElement resetButton = driver.findElement(By.xpath("//input[@value='Reset']"));
    String resetButtonValue = resetButton.getText();
      System.out.println(resetButtonValue);
      
      
           doneRadioButton.click();
        
           firstNameTextbox.click();
           firstNameTextbox.sendKeys("shruthi");
           System.out.println("shruthi is entered in FirstName textbox");
        
        lastNameTextbox.click();
        lastNameTextbox.sendKeys("java");
        System.out.println("java is entered in LastName textbox");
        
        emailTextbox.click();
        emailTextbox.sendKeys("shruthi@gmail.com");
        System.out.println("shruthi@gmail.com is entered in Email textbox");
        
        addressTextbox.click();
        addressTextbox.sendKeys("RK colony kamareddy ");
        System.out.println("H.no-1/234 RK colony Kamareddy is entered in Address textbox");
        
        mobileNumberTextbox.click();
        mobileNumberTextbox.sendKeys("6725341");
        System.out.println("6725341 is entered in MobileNumber textbox");
        
        Thread.sleep(9000);
        
        resetButton.click();
        
            
        
      
        
	}

}
