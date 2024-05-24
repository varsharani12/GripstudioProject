package GripstudioProject.GripstudioProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Login {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 int x; int y;
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
	       
       dc.setCapability("automantionName", "UiAutomator2");
      
       dc.setCapability("platformName", "Android");
      
//       dc.setCapability("platformVersion", 14);//Version is number here
      
       dc.setCapability("deviceName", "Emulator1");
       
       dc.setCapability("resetKeyboard", "true");
  
//       dc.setCapability("autoGrantPermissions","true");
       
      dc.setCapability("autoAcceptAlerts","true");
       dc.setCapability("app", "C:\\Users\\Varsha rani\\Desktop\\Appium\\apk\\GripStudio.apk");
      
       URL url =new URL("http://127.0.0.1:4723/wd/hub");

       @SuppressWarnings({ "rawtypes", "unused" })
		AndroidDriver driver= new AndroidDriver(url,dc);
       
       System.out.println("Application Start");
//       click on popup
      Thread.sleep(2000);
       
      driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
       Thread.sleep(5000);
//       @SuppressWarnings("rawtypes")
//		TouchAction touchAction1 = new TouchAction(driver);
//		touchAction1.tap(TapOptions.tapOptions().withPosition(PointOption.point(537,1312 ))).perform();
//      
// 		@SuppressWarnings("rawtypes")
//			TouchAction touchAction2 = new TouchAction(driver);
// 		touchAction2.tap(TapOptions.tapOptions().withPosition(PointOption.point(546,1867 ))).perform();
       
      
     driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
     
       driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
       
       driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
       
////       click on guest
      driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();	
      
//        click on next button
       Thread.sleep(2000);
      
   		@SuppressWarnings("rawtypes")
			TouchAction touchAction3 = new TouchAction(driver);
   		touchAction3.tap(TapOptions.tapOptions().withPosition(PointOption.point(539,1948 ))).perform();
   		System.out.println(driver.findElementByXPath("//android.widget.TextView[@text=\"Have an account? Login Here\"]").getText());
   		
       Thread.sleep(5000);

   		
//   		click on login here
   	driver.findElementByXPath("//android.widget.TextView[@text=\"Have an account? Login Here\"]").click();
   	 //click on continue with email
   	Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue with Email\"]")).click();

//fill the details
	      Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Email\"]")).click();
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Email\"]")).sendKeys("iamvarsharani+55@gmail.com");
		
		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).click();
		 
		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).sendKeys("Rani@123");
		 driver.hideKeyboard();
		 
		 Thread.sleep(2000);
		 
		 driver.findElementByXPath("//android.widget.TextView[@text=\"NEXT\"]").click();
		 Thread.sleep(5000);
		 
		 
//	 driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
	 
	 
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.alertIsPresent());
	 driver.switchTo().alert().accept();
//		 WebElement allowButton =  driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
//		 allowButton.click();
		 
//		 driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"][0]")).click();
//		
	      
		 System.out.println("Navigate to Home Screen");
		 
		 
		 // verify that we are in home page
		 
//		 WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text=\"No results found!\"]"));
//		 element.getAttribute("No results found!");
//		 
//		 MobileElement element1 = (MobileElement) driver.findElementByClassName("SomeClassName");
//		 String elText = element1.getText();
		   	driver.closeApp();


		 
		

}
}
