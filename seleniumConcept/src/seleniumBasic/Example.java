package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.manage().window().setSize(new Dimension(450,600));
//		driver.manage().window().maximize();
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
	}

}
