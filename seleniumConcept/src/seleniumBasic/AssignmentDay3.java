package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\\\Rohan Workspace\\\\sel1\\\\executables\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement pwd =driver.findElement(By.name("txtPassword"));
        pwd.sendKeys("admin123");
        WebElement login =driver.findElement(By.className("button"));
        login.click();
        Thread.sleep(2000);
        String homepageUrl=driver.getCurrentUrl();
        System.out.println("validation homepageurl: "+homepageUrl.contains("dashboard"));
        
        driver.findElement(By.className("panelTrigger")).click();
		driver.findElement(By.linkText("Logout")).click();

       // driver.close();
        
	}

}
