package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetStoreMenu {

	// MENU NAVIGATIOM METHOD
	public static void navigateToMenu(WebDriver driver) {
		driver.navigate().to(PageURLs.MENU_URL);
	}

	// LEFT ANIMALS CLICKING METHODS
	public static void openFishL(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.FISH_LEFT)).click();

	}

	public static void openDogsL(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.DOGS_LEFT)).click();
	}

	public static void openCatsL(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.CATS_LEFT)).click();
	}

	public static void openRepsL(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.REPS_LEFT)).click();
	}

	public static void openBirdsL(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.BIRDS_LEFT)).click();
	}

	// TOP ANIMALS CLICKING METHOD
	public static void openFishT(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.FISH_TOP)).click();
	}

	public static void openDogsT(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.DOGS_TOP)).click();
	}

	public static void openRepsT(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.REPS_TOP)).click();
	}

	public static void openCatsT(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.CATS_TOP)).click();
	}

	public static void openBirdsT(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.BIRDS_TOP)).click();
	}

	// PICTURED ANIMALS METHOD CLICKING
	public static void openBirdsBC(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.BIRDB_PIC)).click();
	}

	public static void openFishC(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.FISH_PIC)).click();
	}

	public static void openDogsC(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.DOGS_PIC)).click();
	}

	public static void openRepsC(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.REPS_PIC)).click();
	}

	public static void openCatsC(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.CATS_PIC)).click();
	}

	public static void openBirdsC(WebDriver driver) {

		driver.findElement(By.xpath(ObjectsPath.BIRDS_PIC)).click();
	}

	public static void openLogin(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.LoginIcon)).click();
	}

	// HELP METHOD
	public static void openHelp(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.HelpButton)).click();
	}

	public static void logoNavigation(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.LogoButton));
	}

	public static WebElement getSearchButton(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.SearchButton));
	}

	public static void clickSearchButton(WebDriver driver) {
		getSearchButton(driver).click();
	}

	public static void inputSearchButton(WebDriver driver, String data) {
		getSearchButton(driver).sendKeys(data);
	}

	public static void confirmSearchButton(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.ConfirmSearchButton));
	}
	public static WebElement getMyAccount (WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.MyAccountButton));
	}
	public static void clickMyAccount (WebDriver driver) {
		getMyAccount(driver).click();
	}
}
