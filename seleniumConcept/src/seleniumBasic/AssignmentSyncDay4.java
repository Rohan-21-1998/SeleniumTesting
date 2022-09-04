package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class AssignmentSyncDay4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String logPageTitle = driver.getTitle();
		System.out.println(logPageTitle);
		System.out.println("Verify login page: "+ logPageTitle.equals("actiTIME - Login"));
		WebElement usernameinputField = driver.findElement(By.id("username"));
		usernameinputField.sendKeys("admin");
		WebElement passwordinputField = driver.findElement(By.name("pwd"));
		passwordinputField.sendKeys("manager");
		 WebElement login =driver.findElement(By.id("loginButton"));
	        login.click();
	        Thread.sleep(2000);
	        String homePageTitle = driver.getTitle();
	        System.out.println("Verify login page: "+ homePageTitle.equals("actiTIME - Enter Time-Track"));
		WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		logoutButton.click();
		System.out.println("Verify login page: "+ logPageTitle.equals("actiTIME - Login"));
		
		WebElement userNameinputField = driver.findElement(By.id("username"));
		System.out.println("User name is Displayed or not?: "+userNameinputField.isDisplayed());
		System.out.println("User name is functional or not?: "+userNameinputField.isEnabled());
		System.out.println("attributes present or not?: "+userNameinputField.getAttribute("placeholder"));
		String DefaultvalueInUsernameField = userNameinputField.getAttribute("placeholder");
		System.out.println("Default value in usename validation: "+DefaultvalueInUsernameField.equals("Username"));
		//driver.close();
		
	}

}
