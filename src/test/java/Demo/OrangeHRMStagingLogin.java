package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMStagingLogin {
	WebDriver driver;
	
	String un="Admin";
	String pw="admin123";
	
	
	@Test
	public void test1() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		String url="https://"+un+":"+pw+"@"+"staging.orangehrmlive.com";
		driver.get(url);
		driver.manage().window().maximize();
		//driver.quit();
		
		
		
	}

}
