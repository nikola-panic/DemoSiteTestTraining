package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddUser extends AbstractPage01 {

	public AddUser(WebDriver driver) {
		super(driver);
	}
	
	WebElement usernameField = driver.findElement(By.name("username"));
	WebElement passField = driver.findElement(By.name("password"));
	WebElement submitButton = driver.findElement(By.name("FormsButton2"));


	public AddUser fillTheForm(String username, String password) {
		usernameField.sendKeys("username");
		passField.sendKeys("password");
		submitButton.click();
		return new AddUser(driver);
	}

	public LogInPage logIn() {
		driver.findElement(By.partialLinkText("Login page to test it!")).click();
		return new LogInPage(driver);
	}
}

