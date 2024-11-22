package OrangeHRM;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Orangehrm {

	WebDriver driver;
	SoftAssert a1;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    String expectedtext="Dashboard";

	@BeforeTest
	public void driversetup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
	}

	
	@Test(priority=1)
	public void Login() throws IOException, InterruptedException {
		FileReader fr=new FileReader("/Users/apple/eclipse-workspace/TestNG/src/test/java/Configuration.properties");
		Properties p=new Properties();
		p.load(fr);
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name*='us']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.cssSelector("button[type*='s']")).click();
		a1=new SoftAssert();
		Thread.sleep(5000);
		String actualtext=driver.findElement(By.cssSelector("h6[class*='oxd']")).getText();
		AssertJUnit.assertEquals(actualtext, expectedtext);
	}
	
	@AfterTest
	public void enddriver() {
		driver.quit();
		
		
	}


}
