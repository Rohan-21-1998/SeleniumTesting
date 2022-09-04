package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		//String driverPath3=System.getProperty("user.dir")+"E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");
	
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter the URL
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("a[rel=\'async\']")).click();
		WebElement datePlace = driver.findElement(By.cssSelector("#day"));
		System.out.println("Date Place visibale or not : "+datePlace.isDisplayed());
		System.out.println("Date Place Enable or not : "+datePlace.isEnabled());
		
		List<WebElement> sugg = driver.findElements(By.cssSelector("div>div>div>form>div>div:nth-of-type(5)>div:nth-of-type(2)>span>span>select:nth-of-type(1)>option"));
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select dayDrop = new Select(day);
		System.out.println("Is this dropdown is Multiselect?  "+dayDrop.isMultiple());
		System.out.println("BY default value : "+dayDrop.getFirstSelectedOption());
		System.out.println("Suggetion count: "+sugg.size());
//		System.out.println(sugg.);
		for(int i=0 ; i < sugg.size() ; i++) {
			WebElement element = sugg.get(i);
			System.out.println(element.getText());
				//datePlace.
		}
			WebElement monthPlace = driver.findElement(By.cssSelector("select#month"));
			System.out.println("month Place visibale or not : "+monthPlace.isDisplayed());
			System.out.println("month Place Enable or not : "+monthPlace.isEnabled());
			
			List<WebElement> sugg1 = driver.findElements(By.cssSelector("div>div>div>span>span select#month>option"));
			System.out.println("Suggetion count: "+sugg1.size());
			for(int i=0 ; i < sugg1.size() ; i++) {
				WebElement element = sugg1.get(i);
				System.out.println(element.getText());
					//monthPlace.
			}
			WebElement yearPlace = driver.findElement(By.cssSelector("#year"));
			System.out.println("month Place visibale or not : "+yearPlace.isDisplayed());
			System.out.println("month Place Enable or not : "+yearPlace.isEnabled());
			List<WebElement> sugg2 = driver.findElements(By.cssSelector("div>div>div>span>span>select#year>option"));
			System.out.println("Suggetion count: "+sugg2.size());
			for(int i=0 ; i < sugg2.size() ; i++) {
				WebElement element = sugg2.get(i);
				System.out.println(element.getText());
					//yearPlace.
			}

}
}

