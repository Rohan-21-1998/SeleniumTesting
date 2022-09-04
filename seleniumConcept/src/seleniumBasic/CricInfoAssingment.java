package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoAssingment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Rohan Workspace\\seleniumParctice\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement>suggList=driver.findElements(By.cssSelector("body>div>section>section>div>div>nav>div>div>div>div>div>div>a"));
		int suggCount=suggList.size();
		System.out.println(suggCount);
        for(int i=0;i<suggCount;i++) {
        	System.out.println(suggList.get(i).getText());
        }
	}
}