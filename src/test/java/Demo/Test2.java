package Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	
	@Test
	public void tc1() {
		System.out.println("Search");
	}
	
	@Test
	public void tc2() {
		System.out.println("Adv Search");
	}
	
	@BeforeTest
	public void tc3() {
		System.out.println("Login");
	}
	
	@AfterTest
	public void tc4() {
		System.out.println("Logout");
	}

}
