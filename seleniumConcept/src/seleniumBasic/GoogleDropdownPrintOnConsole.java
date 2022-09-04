package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDropdownPrintOnConsole {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe");

		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.get("https://www.google.com");
		
		cdriver.findElement(By.cssSelector("input.gLFyf")).sendKeys("selenium interview questions");
		Thread.sleep(2000);
		List<WebElement> sugg = cdriver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		System.out.println("Suggetion count: "+sugg.size());
		for(int i=0 ; i < sugg.size() ; i++) {
			WebElement element = sugg.get(i);
			System.out.println(element.getText());
		}
	}

}
