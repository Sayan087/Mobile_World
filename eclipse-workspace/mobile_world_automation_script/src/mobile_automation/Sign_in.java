package mobile_automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sign_in {
	@Test(dataProvider="Signin")
	public static void sign_in(String Username, String Password) {
		// TODO Auto-generated method stub
//	System.setProperty("webdriver.edge.driver", "C:\\drivers\\edgedriver_win64 (2)\\msedgedriver.exe");
//	WebDriver driver=new EdgeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Show_pages pages=new Show_pages(driver);
	driver.get("https://qualicoach.org/mwapp/index.html");
	pages.goToSignin();
	pages.signin(Username, Password);
	pages.goToLogin();
	
	driver.quit();
}
	@DataProvider(name="Signin")
	public Object[][] getdata()
	{
		Object [][] data=new Object[2][2];
	  data [0][0]="Sayan";
	  data [0][1]="Sayan@123";
	  
	  data [1][0]="shayangiri786@gmail.com";
	  data [1][1]="Sayan456";
	  return data;
		
	}
}
