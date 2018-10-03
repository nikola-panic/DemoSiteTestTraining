package DemoSitePageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage01 {

	protected WebDriver driver;

	public AbstractPage01(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage navigateToTheSite() {
		driver.navigate().to("http://thedemosite.co.uk/index.php");
		return new HomePage(driver);

	}

}