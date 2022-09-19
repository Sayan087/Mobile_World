package mobile_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contact_us {
	@Test
	
	public static void contact_us() {
				// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayan.giri\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Show_pages pages=new Show_pages(driver);
			driver.manage().window().maximize();
			driver.get("https://mobileworld.banyanpro.com/");
			pages.goToContact();
			pages.goTowindow();
			driver.quit();
		
		
		}
}