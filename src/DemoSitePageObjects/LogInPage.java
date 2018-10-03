package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends AbstractPage01 {

	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	WebElement usernameField = driver.findElement(By.name("username"));
	WebElement passField = driver.findElement(By.name("password"));
	WebElement submitButton = driver.findElement(By.name("FormsButton2"));
	WebElement SuccessfulLogIn = driver.findElement(By.cssSelector("center > b"));

	public LogInPage fillTheLogInForm(String username, String password) {
		usernameField.sendKeys(username);
		passField.sendKeys(password);
		submitButton.click();
		return new LogInPage(driver);

	}

	public String getConfirmationMessage() {
		return SuccessfulLogIn.getText();
	}
}
