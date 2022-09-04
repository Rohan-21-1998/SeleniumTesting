package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMarenaPeginationAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
		List<WebElement>pagination=driver.findElements(By.cssSelector(".nav-pages>a"));
		int pageLink=pagination.size();
		System.out.println(pageLink);
		if(pageLink>0) {
			System.out.println("pagination is available");
		}
		else {
			System.out.println("pagination is not available");
		}
		for(int i=0;i<pageLink;i++) {
			System.out.println(pagination.get(i).getText()+" "+pagination.get(i).getAttribute("href"));
		}
	}

}


