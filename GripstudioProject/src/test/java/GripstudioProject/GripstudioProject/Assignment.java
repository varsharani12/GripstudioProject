package GripstudioProject.GripstudioProject;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.util.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Varsha rani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Varsha rani\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		
            driver.get("https://www.saucedemo.com/");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//login 
		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		 
//		  click on login 
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 
		 Thread.sleep(5000);
		 
//		 Click on add to cart button
		 driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
// click on cart icon
		 
		 driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
//	 click on checkout	 
		 
		 driver.findElement(By.xpath("//button[@id='checkout']")).click();
		 
		 
		 // fill the details
		 driver.findElement(By.xpath("//input[@id='first-name']")).click();
		    

	    		 
	    		 
	    		 driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Varsha");
	    		
	    		 driver.findElement(By.xpath("//input[@id='last-name']")).click();
	    		 
	    		 driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Rani");
	    		 
	    		 driver.findElement(By.xpath("//input[@id='postal-code']")).click();
	    		 driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("201301");
//		  click on continue 
	    		 driver.findElement(By.xpath("//input[@id='continue']")).click();
	    		 
	   Thread.sleep(3000);
	    // click on finish
	   
		 driver.findElement(By.xpath("//button[@id='finish']")).click();
		 
		 Thread.sleep(5000);
		 
////		 Verify
//		 String actualString = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
//		 assertTrue(actualString.contains("Thank you for Your Order"));
		 
		 String exp = "Thank you for your order!";
		    //identify actual error message
		    WebElement m = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		    String act = m.getText();
		    System.out.println("Success mesasge is : "+ act);
		    
		    //verify error message with Assertion
//		    Assert.assertEquals(exp, act);
//		 
//		 close the browser
		 driver.quit();
		 
		 
		 
			
		
		
		
		

	}

}
