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
import page.objects.Registration;
import utility.ExcelUtils;

public class RegistrationTest {

	WebDriver driver;

	public static void TestPause() {
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
		driver.get(PageURLs.REG_URL);
		driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void RegistrationUsersTest() {

		ExcelUtils.setExcell("Random_Users.xlsx");
		ExcelUtils.setWorkSheet(0);

		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.REG_URL);
		// STRINGS FOR EXCEL
		// FOR LOOP FOR 10 USERS TEST
		for (int i = 1; i <= 10; i++) {
			String id_user = ExcelUtils.getDataAt(i, 0);
			String nPass = ExcelUtils.getDataAt(i, 1);
			String rPass = ExcelUtils.getDataAt(i, 1);
			String fName = ExcelUtils.getDataAt(i, 2);
			String lName = ExcelUtils.getDataAt(i, 3);
			String email = ExcelUtils.getDataAt(i, 4);
			String phone = ExcelUtils.getDataAt(i, 5);
			String adress1 = ExcelUtils.getDataAt(i, 6);
			String adress2 = ExcelUtils.getDataAt(i, 7);
			String city = ExcelUtils.getDataAt(i, 8);
			String state = ExcelUtils.getDataAt(i, 9);
			String zip = String.valueOf((int) Double.parseDouble(ExcelUtils.getDataAt(i, 10)));
			String country = ExcelUtils.getDataAt(i, 11);
			String language = ExcelUtils.getDataAt(i, 12);
			String favorite = ExcelUtils.getDataAt(i, 13);
			// FILL IN REGISTRATION FIELDS
			Registration.inputUserID(driver, id_user);
			TestPause();
			Registration.inputNewPass(driver, nPass);
			TestPause();
			Registration.inputRepeatPass(driver, rPass);
			TestPause();
			Registration.inputFirstName(driver, fName);
			TestPause();
			Registration.inputLastName(driver, lName);
			TestPause();
			Registration.inputEmail(driver, email);
			TestPause();
			Registration.inputPhone(driver, phone);
			TestPause();
			Registration.inputAdress1(driver, adress1);
			TestPause();
			Registration.inputAdress2(driver, adress2);
			TestPause();
			Registration.inputCity(driver, city);
			TestPause();
			Registration.inputState(driver, state);
			TestPause();
			Registration.inputZip(driver, zip);
			TestPause();
			Registration.inputCountry(driver, country);
			TestPause();
			Registration.inputLanguage(driver, language);
			TestPause();
			Registration.inputFavorite(driver, favorite);
			TestPause();
			Registration.clickSave(driver);
			TestPause();

			driver.get(PageURLs.REG_URL);
		}
		TestPause();
	}

	@AfterClass
	public void TestQuit() {
		ExcelUtils.closeExcell();
		driver.close();

	}
}
