package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWideges {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String expectedTitle = driver.getTitle();
		System.out.println("Expected TItle : "+expectedTitle);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//		WebElement userName = driver.findElement(By.id("username"));
		//		 userName.sendKeys("admin");
		//		 WebElement password = driver.findElement(By.id("password"));
		//		 userName.sendKeys("Test@123");
		WebElement userName = driver.findElement(By.cssSelector("#username"));
		userName .clear();
		userName .sendKeys("admin");
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.clear();
		password.sendKeys("Test@123");
		driver.findElement(By.className("buttonBlue")).click();
		driver.findElement(By.cssSelector(".addButton")).click();
		//	sales pipeline
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='buttonGroups pull-right'] div>ul.dropdown-menu>:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector(".addButton")).click();

		driver.findElement(By.cssSelector("div[class='buttonGroups pull-right'] div>ul.dropdown-menu>:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector(".addButton")).click();

		driver.findElement(By.cssSelector("div[class='buttonGroups pull-right'] div>ul.dropdown-menu>:nth-of-type(4)")).click();

		driver.findElement(By.cssSelector("i[title='Remove']")).click();
		driver.findElement(By.cssSelector(".confirm-box-ok ")).click();

		driver.navigate().refresh();
		driver.findElement(By.cssSelector("i[title='Remove']")).click();
		driver.findElement(By.cssSelector(".confirm-box-ok ")).click();
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("i[title='Remove']")).click();
		driver.findElement(By.cssSelector(".confirm-box-ok ")).click();
		
		List<WebElement> emptyPage = driver.findElements(By.cssSelector(".gridster_2 ul>li"));
		int clearPage = emptyPage.size();
		if( clearPage > 0) {
			System.out.println("widgets are succesfully deleted");
		}else {
			System.out.println("widgets are succesfully not deleted");
		}
		driver.findElement(By.cssSelector("span[class='fa fa-user']")).click();
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
			driver.close();

		System.out.println("Script Sucssesfull");
	}

}
