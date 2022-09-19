package mobile_automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_in {
	@Test
	public static void sign_in() {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayan.giri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Show_pages pages=new Show_pages(driver);
	driver.get("https://mobileworld.banyanpro.com/");
	pages.goToSignin();
	pages.signin("shayangiri786@gmail.com","Sayan234");
	
	pages.goToLogin();
	driver.quit();
}
}
