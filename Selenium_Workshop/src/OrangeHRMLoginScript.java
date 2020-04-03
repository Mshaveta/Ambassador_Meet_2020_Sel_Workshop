import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginScript {
	public static void main(String[] args) {
		//Relative path - to access the browserDriver path
		String driverPath =  System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		
		//Set the BrowserDriver property
		System.setProperty("webdriver.chrome.driver",driverPath);
		
		// Created object of ChromeDriver Class to To Launch the chrome Browser 
		WebDriver driver = new ChromeDriver();
		
		// code to launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
