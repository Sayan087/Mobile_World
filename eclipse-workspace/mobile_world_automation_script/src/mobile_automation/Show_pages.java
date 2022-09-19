package mobile_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Show_pages {
	WebDriver driver;
	public  Show_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(xpath="//button[normalize-space()='SIGN IN']")
WebElement signin;
@FindBy(xpath="//a[normalize-space()='Sign up']")	
WebElement signup;
@FindBy(xpath="//input[@placeholder='First Name']")
WebElement firstname;	
@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement lastname;
@FindBy(xpath="//input[@placeholder='Enter Email']")
WebElement email;
@FindBy(xpath="//input[@placeholder='Password']")
WebElement password1;
@FindBy(xpath="//input[@type='date']")
WebElement date;
@FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
WebElement gender;
@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
WebElement mobile_num;
@FindBy(xpath="//textarea[@placeholder='Short Bio']")
WebElement bio;
@FindBy(css="button[type='submit']")
WebElement register;
public void goToSignin() {
	
	signin.click();
}
public void goToSignup() {
	signup.click();
}
public void goToData(String Firstname,String Lastname,String Email,String Password,String Date,String Mobile,String Bio ) {
	firstname.sendKeys(Firstname);
	lastname.sendKeys(Lastname);
	email.sendKeys(Email);
	password1.sendKeys(Password);
	date.sendKeys(Date);
	gender.click();
	mobile_num.sendKeys(Mobile);
	bio.sendKeys(Bio);
	
}
public void goToRegister() {
	register.click();
	
}
	
//............Sign in.........................

@FindBy(id="username")
WebElement username;
@FindBy(id="password")
WebElement password12;
@FindBy(css="a[type='submit']")
WebElement login;
public void signin(String Username, String Password) {
	username.sendKeys(Username);
	password12.sendKeys(Password);
}
public void goToLogin() {
	login.click();
}
// ...........contact us...........
@FindBy(linkText="Support")
WebElement support;
@FindBy(linkText="Contact Us")
WebElement contact_us;
@FindBy(css="input[placeholder='Username']")
WebElement username1;
@FindBy(css="input[placeholder='Email']")
WebElement email1;
@FindBy(css="input[placeholder='Phone']")
WebElement phone;
@FindBy(css="textarea[placeholder='Message']")
WebElement message;
@FindBy(css="input[type='submit']")
WebElement send;
public void goToContact() {
	support.click();
	contact_us.click();
}
public void goTowindow() {
	Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

	Iterator<String>it = windows.iterator();
	String parentId = it.next();
    String childId = it.next();
	driver.switchTo().window(childId);
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Sayan");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shayangiri786@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("7866843480");
	driver.findElement(By.cssSelector("textarea[placeholder='Message']")).sendKeys("Good Product");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
}

}



