package GripstudioProject.GripstudioProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Signup {


	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		 int x; int y;
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
	       
        dc.setCapability("automantionName", "UiAutomator2");
       
        dc.setCapability("platformName", "Android");
       
//        dc.setCapability("platformVersion", 14);//Version is number here
       
        dc.setCapability("deviceName", "VirtualEmulator2");
        
        dc.setCapability("resetKeyboard", "true");
        dc.setCapability("app", "C:\\Users\\Varsha rani\\Desktop\\Appium\\apk\\GripStudio.apk");
       
        URL url =new URL("http://127.0.0.1:4723/wd/hub");

        @SuppressWarnings({ "rawtypes", "unused" })
		AndroidDriver driver= new AndroidDriver(url,dc);
        
        System.out.println("Application Start");
//        click on popup
        Thread.sleep(2000);
        
        
       driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
//        @SuppressWarnings("rawtypes")
//		TouchAction touchAction1 = new TouchAction(driver);
//		touchAction1.tap(TapOptions.tapOptions().withPosition(PointOption.point(537,1312 ))).perform();
        
        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"
        		+ "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/"
        		+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
        		+ "android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"
        		+ "/android.view.ViewGroup/android.widget.ImageView")).click();
        
//       click on guest
//      click on guest
      driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();
        //click on next button by cordinates
        
        
       
    		@SuppressWarnings("rawtypes")
			TouchAction touchAction2 = new TouchAction(driver);
    		touchAction2.tap(TapOptions.tapOptions().withPosition(PointOption.point(537,2143 ))).perform();
   //click on continue with email
    		
    		 driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue with Email\"]")).click();
    
//   fill the details
    		 Thread.sleep(3000);
    		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Email\"]")).click();
    		 
    		 
    		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Email\"]")).sendKeys("ranij@gmail.com");
    		
    		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).click();
    		 
    		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).sendKeys("Varsha@12");
    		 
    		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Confirm Password\"]")).click();
    		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Confirm Password\"]")).sendKeys("Varsha@12");
    		 
//    		 click on screen
//    		 driver.longPressKey(66);
    		 driver.hideKeyboard();
    		 
    		 Thread.sleep(2000);
    		 
    		 driver.findElementByXPath("//android.widget.TextView[@text=\"NEXT\"]").click();
	
    		 
    		 
	}
	
    		 
    		 

    	
        
        
        
       
       

	}


