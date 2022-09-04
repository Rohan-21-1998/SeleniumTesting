package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeINputVAlidations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement userNameinputField = driver.findElement(By.id("username"));
		System.out.println("User name is Displayed or not?: "+userNameinputField.isDisplayed());
		System.out.println("User name is functional or not?: "+userNameinputField.isEnabled());
		String defaultvalueinusename = userNameinputField.getAttribute("placeholder");
		System.out.println("Default value of usenameinput fiels: "+ defaultvalueinusename);
		System.out.println("Default value in usename validation: "+defaultvalueinusename.equals("Username"));

		WebElement passwordinputField = driver.findElement(By.name("pwd"));
		System.out.println("password field is Displyed or not: "+passwordinputField.isDisplayed());
		System.out.println("password field is Enabled or not: "+passwordinputField.isEnabled());
		String defaultvalueinpassword =  passwordinputField.getAttribute("placeholder");
		System.out.println("Default value of usenameinput fiels: "+ defaultvalueinpassword);
		System.out.println("Default value in usename validation: "+defaultvalueinpassword.equals("Password"));

		WebElement keepLoggedInLabelCheckBoxText=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("Text DIsplyed or not: "+keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println("Text Enabled or not: "+keepLoggedInLabelCheckBoxText.isEnabled());
		String checkBoxTextName=keepLoggedInLabelCheckBoxText.getText();
		System.out.println("diplayed TExt :"+checkBoxTextName);
		
		WebElement keepLoggedInLabelCheckBox=driver.findElement(By.name("remember"));
		System.out.println("cheack box displyaed or not: "+keepLoggedInLabelCheckBox.isDisplayed());
		System.out.println("cheack box Enabled or not: "+keepLoggedInLabelCheckBox.isEnabled());
		keepLoggedInLabelCheckBox.click();
		System.out.println("cheack box selectable or not: "+keepLoggedInLabelCheckBox.isSelected());
		
		WebElement loggedInBtn=driver.findElement(By.id("loginButton"));
		System.out.println("Login Button Displyed or not: "+loggedInBtn.isDisplayed());
		System.out.println("Login Button Enbled or not: "+loggedInBtn.isEnabled());
		//System.out.println("Login Button is selectable or not: "+loggedInBtn.isSelected());
		
		
	}

}
