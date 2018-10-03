package DemoSiteTest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DemoSitePageObjects.AddUser;
import DemoSitePageObjects.DataBase;
import DemoSitePageObjects.HomePage;
import DemoSitePageObjects.LogInPage;

public class DemoSiteTest {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://Apps/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void shutDown() {
		driver.close();
	}

	@Test
	public void testDemoSite() {
		HomePage onHomePage = new HomePage(driver);
		onHomePage = onHomePage.navigateToTheSite();
		DataBase onDataBase = onHomePage.clickOnDataBase();
		AddUser onAddUser = onDataBase.clickOnAddUser();
		LogInPage onLogIn = onAddUser.fillTheForm("nicpa", "nicpa").logIn();
		onLogIn.fillTheLogInForm("nicpa", "nicpa");
		
		Assert.assertTrue("Login failed.", onLogIn.getConfirmationMessage().contains("**Successful Login**"));
		
	}

}