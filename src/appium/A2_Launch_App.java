package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class A2_Launch_App {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 8.1);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		//dc.setCapability(MobileCapabilityType.APP, "E:\\Automation\\Mobile Testing\\Softwares\\App Info Application Info_v1.0.5_apkpure.com.apk");
		
		
		dc.setCapability("appPackage", "com.android.calculator2");

		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url,dc);
		
		
		
		
		System.out.println("calculator app opened");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
