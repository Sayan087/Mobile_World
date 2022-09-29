package mobile_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Contact_us {
	@Test(dataProvider="contactus")
	
	public static void contact_us(String Username,String Email,String mobile,String msg) {
				// TODO Auto-generated method stub
//		System.setProperty("webdriver.edge.driver", "C:\\drivers\\edgedriver_win64 (2)\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Show_pages pages=new Show_pages(driver);
		driver.manage().window().maximize();
		driver.get("https://qualicoach.org/mwapp/index.html");
		pages.goToContact();
		pages.goTowindow( Username, Email, mobile, msg);
		driver.quit();
		
		
		}
	@DataProvider(name="contactus")
    public Object[][] getdata()
	{
		 Object [][] data=new Object[2][4];
		 data [0][0]="Sayan";
         data [0][1]="shayan786@gmail.com";
         data [0][2]="7063141936";
         data [0][3]="product quality is good";
         
         data [1][0]="Sayan";
         data [1][1]="sayan.giri@qualitestgroup.com";
         data [1][2]="7866843480";
         data [1][3]="Good Product";
         return data;
        
		}
}

