package page.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import page.objects.PageURLs;
import page.objects.PetStoreMenu;

public class PetStoreMenuTest {
	WebDriver driver;

	@BeforeClass
	public void enterHome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danilo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void navigate() {
		PetStoreMenu.navigateToMenu(driver);
		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.MENU_URL);

	}

	@Test(priority = 2)
	public void TestfishURLs() {
		SoftAssert soft = new SoftAssert();
		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openFishT(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.FISH_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openFishL(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.FISH_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openFishC(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.FISH_URL);

		soft.assertAll();
	}

	@Test(priority = 3)
	public void TestdogsURLs() {
		SoftAssert soft = new SoftAssert();
		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openDogsT(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.DOGS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openDogsL(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.DOGS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openDogsC(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.DOGS_URL);

		soft.assertAll();
	}

	@Test(priority = 4)
	public void TestReptilesURLs() {
		SoftAssert soft = new SoftAssert();
		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openRepsT(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.REPS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openRepsL(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.REPS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openRepsC(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.REPS_URL);

		soft.assertAll();
	}

	@Test(priority = 5)
	public void TestCatsURLs() {
		SoftAssert soft = new SoftAssert();
		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openCatsT(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.CATS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openCatsL(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.CATS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openCatsC(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.CATS_URL);

		soft.assertAll();
	}

	@Test(priority = 6)
	public void TestBirdsURLs() {
		SoftAssert soft = new SoftAssert();
		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openBirdsT(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.BIRDS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openBirdsL(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.BIRDS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openBirdsC(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.BIRDS_URL);

		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openBirdsBC(driver);
		soft.assertEquals(driver.getCurrentUrl(), PageURLs.BIRDS_URL);

		soft.assertAll();
	}

	@Test(priority = 7)
	public void TestSignIn() {
		PetStoreMenu.navigateToMenu(driver);
		PetStoreMenu.openLogin(driver);
		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.SIGNIN_URL);

	}

	@AfterClass
	public void TestQuit() {
		driver.close();
	}
}
