package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite");
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("After Suite");
		driver.quit();
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("Before Class");
	}
	
	
	@AfterClass
	public void ac() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void at() {
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
	
	@BeforeGroups("Sanity")
	public void bg() {
		System.out.println("Before Group");
	}
	
	@AfterGroups("Sanity")
	public void ag() {
		System.out.println("After Group");
	}
	
}
