package DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class OrangeHRM {
	WebDriver driver;
	
	@Test(dataProvider = "logindata")
	public void Test1(String un, String pw) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
	    driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		String name=driver.findElement(By.cssSelector("h6[class*='oxd']")).getText();
		AssertJUnit.assertEquals(name, "Dashboard");
	}
	
	@Test
	@DataProvider(name="logindata")
	public Object	[][] testvalues() {
		
		Object[][]values=new Object[1][2];
		
		values[0][0]="Admin";
		values[0][1]="admin123";
		return values;
	}
	
	
	
	@Test
	public void Admin() throws InterruptedException {
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("PIM")).click();
		}
	
	
	

}
