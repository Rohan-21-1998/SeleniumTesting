package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Day3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		WebElement loginbtn= driver.findElement(By.className("initial"));
		loginbtn.click();
		WebElement fpwd=driver.findElement(By.id("toPasswordRecoveryPageLink"));
		 fpwd.click();
		// driver.close();
	}

}
