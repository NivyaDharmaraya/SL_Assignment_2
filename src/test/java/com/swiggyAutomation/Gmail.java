package com.swiggyAutomation;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Gmail {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException //throws InterruptedException, IOException, ClassNotFoundException, SQLException
	{
		/*System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); */
		System.setProperty("webdriver.gecko.driver", "./BrowserUtils/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";		   
	    
		driver.get(baseURL);
	    driver.manage().window().maximize(); 
	    
	//Gmail login with credentials functionality
	    driver.findElement(By.name("identifier")).sendKeys("gincu9026@gmail.com");    
	    driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	  /*  WebElement error = driver.findElement(By.xpath("//div[@class='o6cuMc']"));
	    String actual  =error.getText();
	    System.out.println(actual);
	    Assert.assertEquals(actual, "Couldn't find your Google Account"); */
	    System.out.println(driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText());
	    
	   // System.out.println(driver.findElement(By.className("o6cuMc")).getText());
	    
	 /*   Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("Password@12"); 	    
	    driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();	
	    System.out.println(driver.findElement(By.xpath("(//div[@jsname='B34EJ'])[1]")).getText()); */
	    
 
    //gmail compose functionality
	    Thread.sleep(2000);	    
	    driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();//compose	      
	 
	//gmail to, subject, body details and send functionality       
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("gincu926@gmail.com"); // To
	    driver.findElement(By.name("subjectbox")).sendKeys("Incubyte Deliverables:1"); //subject
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation QA test for Incubyte"); //body
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[contains(text(),'Send')])[2]")).click(); //send
    
	//gmail check Sent-items and inbox functionality	    	    
	    Thread.sleep(2000);	    
	    driver.findElement(By.xpath("//a[contains(text(),'Sent')]")).click(); // sent  
	    Thread.sleep(4000);	    
	    driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).click(); // Inbox	   
   
  //gmail Signout functionality    
	 driver.findElement(By.xpath("//div[@class='gb_yf gb_Wa gb_lg gb_f']")).click();
	 
	 //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 //driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account:')]")).click();  
	 driver.switchTo().frame("account");
	 driver.findElement(By.xpath("//div[contains(text(),'Sign out')]")).click();  
	 
	 
	}
}
