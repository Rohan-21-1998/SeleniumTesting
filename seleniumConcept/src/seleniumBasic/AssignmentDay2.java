package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay2 {
	public static void main(String[] args) {

		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();

		//enter the URL
		driver.get("https://demo.actitime.com");
		//validate page tile
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		int TitalLngth =pageTitle.length();
		System.out.println(TitalLngth);
		String expectedTitle="actiTIME - Login ";
		System.out.println("actual title : "+pageTitle);
		System.out.println("expected tital : "+expectedTitle);
		System.out.println("Title validation: "+pageTitle.equals(expectedTitle));
		//validate current url
		String pageURL=driver.getCurrentUrl();
		System.out.println( pageURL);
		String expectedURL="https://demo.actitime.com/login.do";
		System.out.println("Page URL validation: "+pageURL.equals(expectedURL));
		//get page source content length count
		int contentLength=driver.getPageSource().length();
		System.out.println("Content length: "+contentLength);		
//		close the current browser instance
		//driver.close();
	}
}


