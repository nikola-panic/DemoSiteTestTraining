package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage01 {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	WebElement DataBaseLink = driver.findElement(By.linkText("2. The Database"));

	public DataBase clickOnDataBase() {
		DataBaseLink.click();
		return new DataBase(driver);
	}

}
