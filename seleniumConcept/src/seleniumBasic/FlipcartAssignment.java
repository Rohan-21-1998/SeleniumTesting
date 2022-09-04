package seleniumBasic;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		try {
			driver.findElement(By.cssSelector("button[class=\'_2KpZ6l _2doB4z\']")).click();
		}catch(NoSuchElementException e){
			
		}
		List<WebElement>suggList=driver.findElements(By.xpath("//div[@class='eFQ30H']"));
		int suggCount=suggList.size();
		System.out.println(suggCount);
		for(int i=0;i<suggCount;i++) {
			System.out.println(suggList.get(i).getText());
		}
		Thread.sleep(2000);
		//driver.close();

	}
}
