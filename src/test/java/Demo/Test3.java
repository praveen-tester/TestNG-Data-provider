package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void m2() {
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://preview.facilgo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("Praveen");
		
		
	}

}
