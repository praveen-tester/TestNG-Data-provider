package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@BeforeClass
	public void c1() {
		
		System.out.println("Login...");
		
	}
	
	
	@Test
	public void c2() {
		
		System.out.println("Search...");
		
		
	}
	@AfterClass
	public void c3() {
		
		System.out.println("Logout...");
	}
	
	
	@Test
	public void c4() {
		
		System.out.println("Adv Search");
		
		
	}
	@BeforeTest
	public void tc3() {
		System.out.println("Login1");
	}
	
	@AfterTest
	public void tc4() {
		System.out.println("Logout1");
	}

	

}
