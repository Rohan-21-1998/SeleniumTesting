package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrengeHrmLoginPageValidations {

	public static void main(String[] args) throws InterruptedException {
		//	String xpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","E:/Rohan Workspace/sel1/executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement userNameinputField = driver.findElement(By.id("txtUsername"));
		System.out.println("User name is Displayed or not?: "+userNameinputField.isDisplayed());
		System.out.println("User name is functional or not?: "+userNameinputField.isEnabled());
		driver.findElement(By.name("txtUsername")).sendKeys("Sonu");
		WebElement usErNameinputField = driver.findElement(By.className("form-hint"));
		System.out.println("Placeholder value : "+usErNameinputField.isDisplayed());
		System.out.println(usErNameinputField);

				String defaultvalueinusename = userNameinputField.getAttribute("placeholder");
				System.out.println("Default value of usenameinput fiels: "+ defaultvalueinusename);
				System.out.println("Default value in usename validation: "+defaultvalueinusename.equals("Username"));
		WebElement maleIconOnLoginField = driver.findElement(By.id("frmLogin"));
		System.out.println("male Icon On Login Field : "+maleIconOnLoginField.isDisplayed());

		WebElement passwordinputField = driver.findElement(By.name("txtPassword"));
		System.out.println("password field is Displyed or not: "+passwordinputField.isDisplayed());
		System.out.println("password field is Enabled or not: "+passwordinputField.isEnabled());
				WebElement passwordDefaultinputField = driver.findElement(By.linkText("Password"));
				System.out.println("Default value of usenameinput fiels: "+ passwordDefaultinputField);
				System.out.println("Default value in usename validation: "+passwordDefaultinputField.equals("Password"));
		WebElement lockIconOnLoginField = driver.findElement(By.id("divPassword"));
		System.out.println("Lock Icon On Login Field : "+lockIconOnLoginField.isDisplayed());

		WebElement loggedInBtn=driver.findElement(By.id("btnLogin"));
		System.out.println("Login Button Displyed or not: "+loggedInBtn.isDisplayed());
		System.out.println("Login Button Enbled or not: "+loggedInBtn.isEnabled());
			//	System.out.println("Login Button is selectable or not: "+loggedInBtn.isSelected());

		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement pwd =driver.findElement(By.name("txtPassword"));
		pwd.sendKeys("admin123");
		WebElement login =driver.findElement(By.className("button"));
		login.click();
		Thread.sleep(2000);
		String homepageUrl=driver.getCurrentUrl();
		System.out.println("validation homepageurl: "+homepageUrl.contains("dashboard"));

		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();

		System.out.println("verify after logout homepagr displyed or not: "+homepageUrl.equals(homepageUrl));

		//	driver.close();		
	}

}






