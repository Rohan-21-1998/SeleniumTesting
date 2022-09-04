package seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserDay1 {


public static void main(String[] args) {
	/**
	 * Step1: set the path of required browser executable file using System.setProperty(key, value)
	 * Step2: create an instance of required browser class
	 */
	System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\sel1\\executables\\chromedriver.exe");
	
	ChromeDriver cdriver=new ChromeDriver();
	
	cdriver.get("https://www.google.com");
}
}