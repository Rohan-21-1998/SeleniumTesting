package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeCreateTAskASsignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement userNameinputField = driver.findElement(By.id("username"));
		userNameinputField.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		WebElement loginbtn= driver.findElement(By.className("initial"));
		loginbtn.click();

		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.cssSelector(".addNewButton")).click();
		
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing Web Application");

		driver.findElement(By.cssSelector("#createTasksPopup_content .components_button_label")).click();
		
		driver.findElement(By.cssSelector(" .createdTasksRowsTable tbody>tr>td div.checkbox .img")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div.delete")).click();
		
		driver.findElement(By.cssSelector(".deleteDialog div>div>div>div>span.submitTitle")).click();
		
		WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		logoutButton.click();
		
		System.out.println("************Script Succsesfull**************");
	}

}