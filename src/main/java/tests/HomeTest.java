package tests;

import org.testng.annotations.Test;

import pageObject.HomePage;

public class HomeTest extends BaseTestClass {

	
	
	@Test(groups = { "Sanity" })
	public void a() {
		HomePage hp = new HomePage(driver);
	}

	@Test(groups = { "Sanity", "Regression" })
	public void b() {
		System.out.println("b");
		
	}

	@Test(groups = { "Regression" })
	public void c() {
		System.out.println("c");
	}

}
