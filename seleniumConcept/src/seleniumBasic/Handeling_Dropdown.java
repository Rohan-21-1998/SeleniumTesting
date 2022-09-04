package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handeling_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Rohan Workspace\\seleniumConcept\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skill_Dropdown = driver.findElement(By.cssSelector("#Skills"));
		Select selectSkill = new Select(skill_Dropdown);
		System.out.println(" IS Dropdown Allowing You To Slect Multiple Options : "+selectSkill.isMultiple());
		//**** get default or already select option
		//		WebElement selectedOption=selectSkill.getFirstSelectedOption();
		//		String selectedOptionName=selectedOption.getText();
		//		System.out.println("Already selected option name: "+selectedOptionName);
		//or
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());

		//get option count 
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		selectSkill.selectByIndex(5);
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());

		selectSkill.selectByValue("Programming");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());

		selectSkill.selectByVisibleText("Unix");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());

		System.out.println("***************************************************************************************************");

		WebElement yearDropdown = driver.findElement(By.cssSelector("#yearbox"));
		Select selectYear = new Select(yearDropdown);
		System.out.println(" IS Dropdown Allowing You To Slect Multiple Options : "+selectYear.isMultiple());
		System.out.println("Already selecsted option name: "+selectYear.getFirstSelectedOption().getText());
		List<WebElement> options1=selectYear.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options1.size();i++) {
			System.out.println("Option "+i+": "+options1.get(i).getText());
		}
		selectYear.selectByIndex(83);
		System.out.println("Already selected option name: "+selectYear.getFirstSelectedOption().getText());

		selectYear.selectByValue("1995");
		System.out.println("Already selected option name: "+selectYear.getFirstSelectedOption().getText());

		selectYear.selectByVisibleText("1996");
		System.out.println("Already selected option name: "+selectYear.getFirstSelectedOption().getText());

		System.out.println("*********************************************************************************************");

		WebElement monthDropdown = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
		Select selectMonth = new Select(monthDropdown);
		System.out.println(" IS Dropdown Allowing You To Slect Multiple Options : "+selectMonth.isMultiple());
		System.out.println("Already selecsted option name: "+selectMonth.getFirstSelectedOption().getText());
		List<WebElement> options2=selectMonth.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options1.size();i++) {
			System.out.println("Option "+i+": "+options1.get(i).getText());
		}
		selectMonth.selectByIndex(3);
		System.out.println("Already selected option name: "+selectMonth.getFirstSelectedOption().getText());

		selectMonth.selectByValue("May");
		System.out.println("Already selected option name: "+selectMonth.getFirstSelectedOption().getText());

		selectMonth.selectByVisibleText("October");
		System.out.println("Already selected option name: "+selectMonth.getFirstSelectedOption().getText());

		System.out.println("*********************************************************************************************");

		WebElement dayDropdown = driver.findElement(By.cssSelector("#daybox"));
		Select selectDay = new Select(dayDropdown);
		System.out.println(" IS Dropdown Allowing You To Slect Multiple Options : "+selectDay.isMultiple());
		System.out.println("Already selecsted option name: "+selectDay.getFirstSelectedOption().getText());
		List<WebElement> options3=selectDay.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options3.size();i++) {
			System.out.println("Option "+i+": "+options3.get(i).getText());
		}
		selectDay.selectByIndex(9);
		System.out.println("Already selected option name: "+selectDay.getFirstSelectedOption().getText());

		selectDay.selectByValue("28");
		System.out.println("Already selected option name: "+selectDay.getFirstSelectedOption().getText());

		selectDay.selectByVisibleText("27");
		System.out.println("Already selected option name: "+selectDay.getFirstSelectedOption().getText());

		
	} 

}
