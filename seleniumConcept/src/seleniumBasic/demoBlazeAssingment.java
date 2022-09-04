package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBlazeAssingment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actal url : "+actualUrl);
		List<WebElement> sugg1 = driver.findElements(By.cssSelector(".brandmenu-v2 ul>li>a"));
		System.out.println("Suggetion count: "+sugg1.size());
		for(int i=0 ; i <sugg1.size() ; i++) {
			WebElement element = sugg1.get(i);
			System.out.println(element.getText());
		}

	}
}