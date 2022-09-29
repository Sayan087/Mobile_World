package mobile_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sign_up {
	@Test(dataProvider="Signup")
	public static void sign_up(String Firstname,String Lastname,String Email,String Password,String Date,String Mobile,String Bio ) throws InterruptedException {
// TODO Auto-generated method stub
//		System.setProperty("webdriver.edge.driver", "C:\\drivers\\edgedriver_win64 (2)\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Show_pages pages=new Show_pages(driver);
		driver.get("https://qualicoach.org/mwapp/index.html");
		pages.goToSignin();
		pages.goToSignup();
		pages.goToData(Firstname,Lastname,Email,Password,Date,Mobile,Bio );
	    Thread.sleep(2000);
	    pages.goToRegister();
	    Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	
	}

	 @DataProvider(name="Signup")
		public Object[][] getdata()
		{
		 Object [][] data=new Object[2][7];
		 data [0][0]="Sayan";
         data [0][1]="Giri";
         data [0][2]="shayangiri786@gmail.com";
         data [0][3]="Sayan123";
         data [0][4]="02/07/2000";
         data [0][5]="7063141936";
         data [0][6]="trainee";
         
         data [1][0]="Sayantan";
         data [1][1]="Giri";
         data [1][2]="sayan.giri@qualitestgroup.com";
         data [1][3]="Sayan@123";
         data [1][4]="10/07/1999";
         data [1][5]="7866843480";
         data [1][6]="Trainee Engineer";
		  return data;
		 
        } 

}
