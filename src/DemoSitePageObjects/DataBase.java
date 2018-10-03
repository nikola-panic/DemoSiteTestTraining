package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataBase extends AbstractPage01 {

	public DataBase(WebDriver driver) {
		super(driver);
	}
	
	WebElement addUserLink = driver.findElement(By.linkText("add a User"));

	public AddUser clickOnAddUser() {
		addUserLink.click();
		return new AddUser(driver);
	}
}
