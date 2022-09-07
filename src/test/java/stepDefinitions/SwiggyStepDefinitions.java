package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//import io.cucumber.core.cli.Main;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

  @RunWith(Cucumber.class)
  public class SwiggyStepDefinitions {
	  
		// Hooks Opening and Closing browser
		public static WebDriver driver;

		    @Before
		    public void BeforeExecution() 
		    {
			    System.setProperty("webdriver.gecko.driver","./BrowserUtils/geckodriver.exe");
	    	    driver = new FirefoxDriver();
			    System.out.println("Executing before hook");
		    }
		
		    
		    @After
			public static void AfterExecution() throws InterruptedException
			{
				System.out.println("Executing After Hook, Execution Completed");
				Thread.sleep(3000);
				driver.close();
			}

		    
		    @Given("^The user launches Swiggy application$")
		    public void the_user_launches_swiggy_application() throws Throwable 
		    {		    
		    	String swiggyURL = "https://www.swiggy.com/";		   
		    	driver.get(swiggyURL);
			    driver.manage().window().maximize(); 
			    Thread.sleep(3000);
		    }
		  
	  //----- SCENARIO -->1 --- Verify if user is able to select location and restaurant
	  
		    @When("^enter the user location and search$")
		    public void enter_the_user_location_and_search() throws Throwable 
		    {

	 	           driver.findElement(By.xpath("//input[@type='text']")).sendKeys("JP Nagar, Bangalore");
	 	           Thread.sleep(1000);
	 	    }

		    @Then("^enters restaurant details and search$")
		    public void enters_restaurant_details_and_search() throws Throwable 
		    {		    	
		    	   driver.findElement(By.xpath("//button[@tabindex='2']")).click();
			 	   Thread.sleep(2000);
			 	   driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
			 	   Thread.sleep(1000);
	 	   }

		    
		    @And("^selects the restaurant and search item$")
		          public void selects_the_restaurant_and_search_item() throws Throwable 
		    {
	    	      driver.findElement(By.className("_2FkHZ")).sendKeys("Truffles");
		 	      Thread.sleep(1000);
		 	      driver.findElement(By.xpath("//div[contains(text(),'Restaurant')]")).click();
		 	      Thread.sleep(1000);
		 	      driver.findElement(By.xpath("//div[contains(text(),'Truffles')]")).click();
		 	      Thread.sleep(1000);
		 	}

    
	 //----- SCENARIO -->2   --------- Verify if user is able to add items and checkout
	    
	    @When("^search for item$")
	    public void search_for_item() throws Throwable 
	    {
	    	enter_the_user_location_and_search();
	    	enters_restaurant_details_and_search();
	    	selects_the_restaurant_and_search_item();
	    	
	    	driver.findElement(By.className("_5mXmk")).sendKeys("Burger");
		 	Thread.sleep(1000);
		 	driver.findElement(By.xpath("(//div[@class='_1RPOp'])[1]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
	    }

	    
	    @Then("^adds item to cart$")
	    public void adds_item_to_cart() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[contains(text(),'Add Item')]")).click();
		    Thread.sleep(1000);
		    //driver.findElement(By.className("_5mXmk")).clear(); 
		    //driver.findElement(By.className("_5mXmk")).sendKeys("Brownie Point");
	    }
	    

	    @And("^navigates to checkout page$")
	    public void navigates_to_checkout_page() throws Throwable 
	    {
	        driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
	        System.out.println("checkout");	        
	    }

	    
	    @And("^checks the total amount$")
	    public void checks_the_total_amount() throws Throwable 
	    {
	        WebElement total = driver.findElement(By.className("_3ZAW1"));
	        String amt = total.getText();
	        System.out.println(amt);
	    }
	    
	    // SCENARIO -->3  ------ Verify if user is able to delete item from cart
	    
	    @When("^navigates to cart$")
	    public void navigates_to_cart() throws Throwable 
	    {
	    	Thread.sleep(1000);
	    	search_for_item();
	    	adds_item_to_cart();
	    	navigates_to_checkout_page();
	    	checks_the_total_amount();
	    	
	    	Thread.sleep(1000);
	        driver.navigate().back();
	        driver.findElement(By.className("_5mXmk")).sendKeys("Hot Dog");
	 	    Thread.sleep(1000);
	 	    driver.findElement(By.xpath("(//div[@class='_3Hy2E lWLSU'])[1]")).click();
	 	    Thread.sleep(1000);
	        driver.findElement(By.xpath("//span[contains(text(),'Add Item')]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
	        
	    }

	    
	    @Then("^check details of items in cart$")
	    public void check_details_of_items_in_cart() throws Throwable 
	    {
	    	checks_the_total_amount();
	    }

	    
	    @And("^delete the added items$")
	    public void delete_the_added_items() throws Throwable 
	    {
	    	Thread.sleep(1000);
	        driver.findElement(By.xpath("(//div[@class='_29Y5Z'])[1]")).click();
	        System.out.println("one item deleted");
	    }	    
	    

	}
