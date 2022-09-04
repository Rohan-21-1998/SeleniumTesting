package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPhoneCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actal url : "+actualUrl);
		List<WebElement> deviceName=driver.findElements(By.cssSelector("div#tbodyid h4>a"));
		List<WebElement> devicePrice=driver.findElements(By.cssSelector("div#tbodyid h5"));
		
		for(int i=0;i<deviceName.size();i++) {
			System.out.println(deviceName.get(i).getText()+": "+devicePrice.get(i).getText());
		}

	}

}
