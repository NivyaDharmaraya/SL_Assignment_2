package com.swiggyAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy_sel {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./BrowserUtils/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        String swiggyURL = "https://www.swiggy.com/";		   
	    driver.get(swiggyURL);
	    driver.manage().window().maximize(); 


/*	    
/* popular cities in india
	driver.findElement(By.xpath("//a[contains(text(),'Bangalore')]")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;		//js.executeScript("window.scrollBy(0, 400)", "");
   driver.findElement(By.xpath("//div[conains(text(),'Enter street name, area etc...')]")).sendKeys("Cunningham road, Bangalore");
 */  
   
 //  driver.findElement(By.xpath("//span[contains(text(),'Locate Me')]")).click();
 //  driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
  // driver.findElement(By.className("_1tcx6")).click();
   
  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("JP Nagar, Bangalore");
  Thread.sleep(3000);
  driver.findElement(By.xpath("//button[@tabindex='2']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
  Thread.sleep(1000);
  driver.findElement(By.className("_2FkHZ")).sendKeys("Truffles");
  Thread.sleep(1000);
  driver.findElement(By.xpath("//div[contains(text(),'Restaurant')]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//div[contains(text(),'Truffles')]")).click();
  Thread.sleep(1000);
  driver.findElement(By.className("_5mXmk")).sendKeys("Burger");
  Thread.sleep(1000);
  //	driver.findElement(By.className("b5XpK _2cl4v _1Q69C")).click();
 // JavascriptExecutor js = (JavascriptExecutor)driver;		
  //js.executeScript("window.scrollBy(0, 400)", "");
  Thread.sleep(1000);
  driver.findElement(By.xpath("(//div[@class='_1RPOp'])[1]")).click();
  driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
  driver.findElement(By.xpath("//span[contains(text(),'Add Item')]")).click();
  driver.findElement(By.className("_5mXmk")).clear(); 
  Thread.sleep(1000);
  driver.findElement(By.className("_5mXmk")).sendKeys("Brownie Point");
  //driver.findElement(By.xpath("(//div[@class='_3L1X9 _29ugw']//div[@class='_1ds9T'])")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
  Thread.sleep(1000);
  WebElement total = driver.findElement(By.className("_3ZAW1"));
  String amt = total.getText();
  System.out.println(amt);
  
  Thread.sleep(5000);
  driver.navigate().back();
  driver.findElement(By.className("_5mXmk")).sendKeys("Hot Dog");
  Thread.sleep(1000);
  driver.findElement(By.xpath("(//div[@class='_3Hy2E lWLSU'])[1]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//span[contains(text(),'Add Item')]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
  System.out.println("final");
  Thread.sleep(1000);
  driver.findElement(By.xpath("(//div[@class='_29Y5Z'])[1]")).click();
	}}
  //JavascriptExecutor js1 = (JavascriptExecutor)driver;		
  //js1.executeScript("window.scrollBy(0, -250)", "");
  //--driver.findElement(By.className("_5mXmk")).sendKeys("Brownie Point");
  //--driver.findElement(By.xpath("//div[contains(text(),'Brownie Point')]")).click();
  //driver.findElement(By.xpath("//div[contains(text(),'ADD')]")).click();
  //--driver.findElement(By.xpath("(//div[@class='_3L1X9 F8dpS']//div[@class='_1RPOp'])[1]")).click();
// driver.findElement(By.className("_3lmRa _2At8F")).click(); 
 // WebElement down = driver.findElement(By.xpath("//div[@class='_3Um38 _2oQ4_']//div[@class='_1oLDb']//span[@class='_2W-T9']"));   ////span[@class='_2W-T9']
 // down.sendKeys(Keys.ARROW_DOWN, Keys.RETURN); 
  
 // driver.findElement(By.xpath("//span[]contains(text(),'J. P. Nagar, Bengaluru, Karnataka, India')")).click();
 // -- driver.findElement(By.xpath("//a[@class='_3iFC5']")).click(); 
 // driver.findElement(By.xpath("//span[contains(text(),'FIND FOOD')]")).click();
 //--driver.findElement(By.xpath("//div[@class='_1oLDb']//button[@class='_3lmRa _2At8F']")).click();
	
/*JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("javascript:window.scrollBy(700,600)"); */
/*
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0, 600)", "");

driver.findElement(By.xpath("//div[contains(text(),'Top Rated')]")).click(); */

 