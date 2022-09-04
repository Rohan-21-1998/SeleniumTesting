package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Assignment {

	public static void main(String[] args) {
		//String driverPath3=System.getProperty("user.dir")+"E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.amazon.in");
			String pageTital = driver.getTitle();
			System.out.println("home page Tital : "+pageTital);
		driver.findElement(By.cssSelector("a[href='/gp/sva/dashboard?ref_=nav_cs_apay']")).click();
		String pageUrl = driver.getCurrentUrl();
		System.out.println("current PAge URl Amzon PAy  : "+pageUrl);
		driver.navigate().back();
		System.out.println("VErify Home PAge tital : "+driver.getCurrentUrl().equals(driver.getCurrentUrl()));
		
		driver.findElement(By.cssSelector("a[href=\'/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\']")).click();
		String pageUrl1 = driver.getCurrentUrl();
		System.out.println("current PAge URl Amzon PAy  : "+pageUrl1);
		driver.navigate().back();
		System.out.println("VErify Home PAge tital : "+driver.getCurrentUrl().equals(driver.getCurrentUrl()));
		driver.close();
	}

}
