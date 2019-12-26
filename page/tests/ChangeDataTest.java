package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PageURLs;
import page.objects.PetStoreMenu;
import page.objects.Registration;
import page.objects.SignIn;

public class ChangeDataTest {
	WebDriver driver;

	@BeforeClass
	public void TestData() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danilo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(PageURLs.MENU_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TestDataChange() {
		SoftAssert sa = new SoftAssert();

		String newFname = "LeBronJames";
		String newCity = "Belgrade";
		String newCountry = "Serbia";

		PetStoreMenu.openLogin(driver);
		RegistrationTest.TestPause();
		SignIn.clickUserName(driver);
		RegistrationTest.TestPause();
		SignIn.inputUserName(driver, "desole");
		RegistrationTest.TestPause();
		SignIn.clickPassword(driver);
		RegistrationTest.TestPause();
		SignIn.inputPassword(driver, "HqN5Dwxxb");
		RegistrationTest.TestPause();
		SignIn.clickLoginButton(driver);
		RegistrationTest.TestPause();
		PetStoreMenu.clickMyAccount(driver);
		RegistrationTest.TestPause();
		Registration.inputFirstName(driver, newFname);
		RegistrationTest.TestPause();
		Registration.inputCity(driver, newCity);
		RegistrationTest.TestPause();
		Registration.inputCountry(driver, newCountry);
		RegistrationTest.TestPause();
		Registration.clickACCSave(driver);

		// TEST NEW FIELDS
		sa.assertEquals(Registration.getFirstName(driver).getAttribute("value"), newFname);
		RegistrationTest.TestPause();
		sa.assertEquals(Registration.getCity(driver).getAttribute("value"), newCity);
		RegistrationTest.TestPause();
		sa.assertEquals(Registration.getCountry(driver).getAttribute("value"), newCountry);
		RegistrationTest.TestPause();
		sa.assertAll();

	}

	@AfterClass
	public void TestQuit() {
		driver.close();
	}

}
