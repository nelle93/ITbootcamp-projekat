package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.objects.HomePage;
import page.objects.PageURLs;

public class HomePageTest {

	WebDriver driver;

	public static void wait1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void enterToHomePage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danilo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void openHomePage() {
		HomePage.openHomePage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.URL);
		wait1();
	}

	@Test(priority = 2)
	public void navigateToHP() {
		HomePage.navigateToHP(driver);
		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.URL);
		wait1();
	}

	@Test
	public void clickStoreIcon() {
		HomePage.navigateToHP(driver);
		HomePage.clickStoreIcon(driver);
		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.MENU_URL);
	}

	@AfterClass
	public void TestQuit() {
		driver.close();
	}
}