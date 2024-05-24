package GripstudioProject.GripstudioProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Signup_Continue_WithGoogle {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
//			
		 int x; int y;
			// TODO Auto-generated method stub
			DesiredCapabilities dc= new DesiredCapabilities();
		       
	       dc.setCapability("automantionName", "UiAutomator2");
	      
	       dc.setCapability("platformName", "Android");
	      
//	       dc.setCapability("platformVersion", 14);//Version is number here
	      
	       dc.setCapability("deviceName", "Emulator1");
	       
	       dc.setCapability("resetKeyboard", "true");
//	       dc.setCapability("autoAcceptAlerts", "true");
	       
//	       dc.setCapability("browserName", "chrome");
	  
//	       dc.setCapability("autoGrantPermissions","true");
//	      dc.setCapability("chromedriverExecutable","C:\\Users\\Varsha rani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	       
	      dc.setCapability("autoAcceptAlerts","true");
	       dc.setCapability("app", "C:\\Users\\Varsha rani\\Desktop\\Appium\\apk\\GripStudio.apk");
	      
	       URL url =new URL("http://127.0.0.1:4723/wd/hub");

	       @SuppressWarnings({ "rawtypes", "unused" })
			AndroidDriver driver= new AndroidDriver(url,dc);
	       
	      
	       
	       System.out.println("Application Start");
//	       click on popup
	      
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
//	      
	       Thread.sleep(5000);
	        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
//	       click on guest
	        Thread.sleep(2000);
      driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();	
//	      click on guest
//	      driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"
//	      		+ "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
//	      		+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();
	        //click on next button
	        
	        
      Thread.sleep(2000);
	    		@SuppressWarnings("rawtypes")
				TouchAction touchAction2 = new TouchAction(driver);
	    		touchAction2.tap(TapOptions.tapOptions().withPosition(PointOption.point(537,1948 ))).perform();
	    		Thread.sleep(2000);
	    		
	 // click on continue with google
	    		 driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue with Google\"]")).click();	
	    		 
	    			Thread.sleep(5000);
		    			 
	    		 // Set implicit wait
//	    	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    			
//	    			 driver.findElement(By.xpath("//android.view.View[@resource-id=\"yDmH0d\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.TextView[2]")).click();
//	    			
//	    	      driver.findElement(By.xpath("//android.view.View[@resource-id=\"yDmH0d\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.TextView[2]")).sendKeys("varsha.rani@simubladetechnology.com");    	
//	    	      driver.hideKeyboard();
//	    	      
//	    	      WebElement nextButton = driver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Next\"]")); // Replace with appropriate locator
//    	        nextButton.click();
//    	        Thread.sleep(5000);
//    	     //   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	    	           	    
////	    	      
//    	      driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Varsha@1234");
//	    	        driver.hideKeyboard();
//   	        // Click on the "Next" button
//   	        WebElement nextButton2 = driver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Next\"]")); // Replace with appropriate locator
//	    	        nextButton2.click() ;  	    


//	        		 click on screen
//	        		 driver.longPressKey(66);
//	        		 driver.hideKeyboard();
	        		 
//	        		 Thread.sleep(5000);
	        		 
//	        		 driver.findElementByXPath("//android.widget.TextView[@text=\"NEXT\"]").click();
	    	        
	    	        WebElement clickonAccount = driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.gms:id/account_display_name\"]"));
	    	        clickonAccount.click();
	    	        Thread.sleep(10000);
	    	   
	    	        
//	    	       driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")).click();
//	    	       Thread.sleep(2000);
//		    	   
//	    	        
//	    	       driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Continue without face or fingerprint\"]")).click();
//	    	       driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Password\"]")).click();
//	    	       Thread.sleep(2000);
//		    	   
//	    	        
//	    	       
//	    	       driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Password\"]")).sendKeys("1234");
//	    	       
//	    	       
//	    	       driver.findElementByXPath("//android.widget.TextView[@text=\"NEXT\"]").click();
//	    	       Thread.sleep(2000);
//	    	       driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Password\"]")).sendKeys("1234");
//	    	       
//	    	       driver.findElementByXPath("//android.widget.TextView[@text=\"CONFIRM\"]").click();
//	    	       Thread.sleep(2000);
//	    	       driver.findElementByXPath("//android.widget.Button[@text=\"DONE\"]").click();
//	    	       Thread.sleep(2000);
//		    	   
//	    	        
	    	       
	    	      
//	    	      WebDriverWait wait = new WebDriverWait(driver, 2);
//	    	   	 wait.until(ExpectedConditions.alertIsPresent());
	    	        final WebDriverWait wait = new WebDriverWait(driver, 30);
	    	        wait.until(ExpectedConditions.alertIsPresent());
	    	
	    	   	 driver.switchTo().alert().accept();
	    	   	 
	    	   	 
	    	   	 System.out.println("Navigate to Home Screen");
	    	        
	    	   	driver.closeApp();
	    	    }

	}


