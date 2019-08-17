

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mvn_launchcode {
	public static WebDriver driver;
	
	@Test
	public void setup() {
	 // Driver path
	//	String driverPath=System.getProperty("user.dir")+"/src/test/java\\browserdriver\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", driverPath);
		
	
//		//Create an instance of ChromeOptions 
//		ChromeOptions options = new ChromeOptions();
//
//		options.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();	
		 driver = new ChromeDriver();		
		//driver.get("//D:/template/nested_menus.html#");
		 driver.get("https://www.flipkart.com");
	//action.sendKeys
		 driver.findElement(By.xpath("//input[type()='text']"));
}
}