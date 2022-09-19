package mobile_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_up {
	@Test
	public static void sign_up() throws InterruptedException {
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayan.giri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Show_pages pages=new Show_pages(driver);
		driver.get("https://mobileworld.banyanpro.com/");
		pages.goToSignin();
		pages.goToSignup();
		pages.goToData("Sayan", "Giri", "shayangiri786@gmail.com", "Sayan123", "21/08/2000", "7866843480", "Student");
	    Thread.sleep(2000);
	    pages.goToRegister();
	    Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	
	}

}
