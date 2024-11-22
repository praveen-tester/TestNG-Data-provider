package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;



public class test {
	
	@Test
	public void m1() {
		
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://preview.facilgo.com/");
		driver.manage().window().maximize();
		String Actualtitle=driver.getTitle();
		String Expectedtitle="FacilGo";
		try {
			Assert.assertEquals(Actualtitle, Expectedtitle);
			
		}catch(Exception e){
			driver.quit();
		}
		
	}

}
