package seleniumBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileDataInScript {

	private static final String appUrl = null;

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\Rohan Workspace\\seleniumParctice\\executables\\chromedriver.exe");
		Properties prop = new Properties();
		prop.load(fis);
	 
		String driverExecutablePath = prop.getProperty("driverExecutablePath");
		String driverKey = prop.getProperty("driverKey");
		String appUrl = prop.getProperty("appUrl");
		String userName = prop.getProperty("userName");
		String password = prop.getProperty("password");
		String loginPageTitle = prop.getProperty("loginPageTitle");
		String buttonName = prop.getProperty("buttonName");
		
		System.out.println(driverExecutablePath+"\n"+driverKey+"\n"+appUrl+"\n"+userName+"\n"+password+"\n"+loginPageTitle+"\n"+buttonName);
		
		String chromeExePath=System.getProperty("user.dir")+driverExecutablePath;
		//setting the path for driver executable
		System.setProperty(driverKey, chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get(appUrl);
		//to get title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
				
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		//validating login page
		System.out.println("Title validation status: "+pageTitle.equals(loginPageTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		//validating login page
		System.out.println("Url validation status: "+pageUrl.contains(appUrl));
		
		String pageSource=driver.getPageSource();
	//	System.out.println("Page Source: "+pageSource);
		System.out.println("Page Source length: "+pageSource.length());
	
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys(userName);
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys(password);
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
//		
		
//		driver.close();

		 
		 
		 
		
	}

}
