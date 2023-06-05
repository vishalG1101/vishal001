package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest {
	
	HomePage hp;
	LoginPage lp;
	
	@BeforeClass
	public void  objectCreation() {
		
		lp =new LoginPage(driver);
		hp= new HomePage(driver);
	}
	
	@BeforeClass
	public void precondition() {
		
		lp.enterCred("Admin", "admin123");
		lp.clickButton();
	}
	
	@Test
	public void verifyTitle() {
		
		Assert.assertEquals(driver.getTitle(), "HRM", "Title does not matched);");
	}
	
	@Test
	public void logout() {
		
		hp.clickOnProfile();
		//hp.clickOnLogout();
		Assert.assertTrue(false);
	}

}
