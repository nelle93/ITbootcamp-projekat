package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.objects.PageURLs;
import page.objects.SignIn;
import utility.ExcelUtils;

public class SignInTest {
	WebDriver driver;

	public static void wait1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void TestData() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danilo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(PageURLs.SIGNIN_URL);
		driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void LoginTest() {
		ExcelUtils.setExcell("Random_Users.xlsx");
		ExcelUtils.setWorkSheet(0);

		SignIn.inputUserName(driver, ExcelUtils.getDataAt(1, 0));

		wait1();
		SignIn.clickPassword(driver);
		wait1();
		SignIn.inputPassword(driver, ExcelUtils.getDataAt(1, 1));
		wait1();
		SignIn.clickLoginButton(driver);
		wait1();
		SignIn.clickSignOut(driver);
		wait1();

		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.MENU_URL);

	}

	@AfterClass
	public void TestQuit() {
		
		ExcelUtils.closeExcell();
		driver.close();

	}
}
