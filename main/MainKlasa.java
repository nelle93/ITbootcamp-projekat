package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.AddToCart;
import page.objects.HomePage;
import page.objects.ObjectsPath;
import page.objects.PageURLs;
import page.objects.PetStoreMenu;
import page.objects.Registration;
import page.objects.SignIn;

public class MainKlasa {

	public static void wait1() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danilo\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(PageURLs.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wait1();
		HomePage.clickStoreIcon(driver);
		wait1();
		PetStoreMenu.openLogin(driver);
		wait1();
		SignIn.clickUserName(driver);
		wait1();
		SignIn.inputUserName(driver, "desole");
		wait1();
		SignIn.clickPassword(driver);
		wait1();
		SignIn.inputPassword(driver, "HqN5Dwxxb");
		wait1();
		SignIn.clickLoginButton(driver);
		wait1();
		PetStoreMenu.openRepsC(driver);
		wait1();
		AddToCart.chooseIguana(driver);
		wait1();
		AddToCart.addIguana(driver);
		wait1();
		PetStoreMenu.logoNavigation(driver);
		wait1();
		SignIn.clickSignOut(driver);
		wait1();
		PetStoreMenu.openLogin(driver);
		wait1();
		SignIn.clickRegistrationLink(driver);
		wait1();
		Registration.clickUserID(driver);
		wait1();
		Registration.inputUserID(driver, "gotovo12345");
		wait1();
		Registration.clickNewPass(driver);
		wait1();
		Registration.inputNewPass(driver, "BbaF7oB385");
		wait1();
		Registration.clickRepeatPass(driver);
		wait1();
		Registration.inputRepeatPass(driver, "BbaF7oB385");
		wait1();
		Registration.clickFirstName(driver);
		wait1();
		Registration.inputFirstName(driver, "Osbourn");
		wait1();
		Registration.clickLastName(driver);
		wait1();
		Registration.inputLastName(driver, "Grinsdale");
		wait1();
		Registration.clickEmail(driver);
		wait1();
		Registration.inputEmail(driver, "ogrinsdalef@hao123.com");
		wait1();
		Registration.clickPhone(driver);
		wait1();
		Registration.inputPhone(driver, "240-359-0201");
		wait1();
		Registration.clickAdress1(driver);
		wait1();
		Registration.inputAdress1(driver, "00286 Park Meadow Parkway");
		wait1();
		Registration.clickAdress2(driver);
		wait1();
		Registration.inputAdress2(driver, "57972 Morning Parkway");
		wait1();
		Registration.clickCity(driver);
		wait1();
		Registration.inputCity(driver, "Silver Spring");
		wait1();
		Registration.clickState(driver);
		wait1();
		Registration.inputState(driver, "Maryland");
		wait1();
		Registration.clickZip(driver);
		wait1();
		Registration.inputZip(driver, "20910");
		wait1();
		Registration.clickCountry(driver);
		wait1();
		Registration.inputCountry(driver, "United States");
		wait1();
		Registration.inputLanguage(driver, "japanese");
		wait1();
		Registration.inputFavorite(driver, "REPTILES");
		wait1();
		Registration.clickSave(driver);
		wait1();

	}

}
