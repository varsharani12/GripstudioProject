package GripstudioProject.GripstudioProject;





    

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Apkinstall {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        DesiredCapabilities dc= new DesiredCapabilities();
       
        dc.setCapability("automantionName", "UiAutomator2");
       
        dc.setCapability("platformName", "Android");
       
//        dc.setCapability("platformVersion", 14);//Version is number here
       
        dc.setCapability("deviceName", "VirtualEmulator2");
       
        dc.setCapability("app", "C:\\Users\\Varsha rani\\Desktop\\Appium\\apk\\GripStudio.apk");
       
        URL url =new URL("http://127.0.0.1:4723/wd/hub");

        @SuppressWarnings({ "rawtypes", "unused" })
		AndroidDriver driver= new AndroidDriver(url,dc);
        
        System.out.println("Application Start");
        
        driver.quit();
       
       
       
    }

}
