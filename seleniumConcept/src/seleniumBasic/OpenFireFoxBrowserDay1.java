package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenFireFoxBrowserDay1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Rohan Workspace\\sel1\\executables\\geckodriver.exe");
		WebDriver fdriver = new ChromeDriver();
		fdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String actualtital = fdriver.getTitle();
		System.out.println(actualtital);
	}
}
