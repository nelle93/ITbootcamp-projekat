package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	// USER ID
	public static WebElement getUserID(WebDriver driver) {

		return driver.findElement(By.xpath(ObjectsPath.REG_USER_ID));
	}

	public static void clickUserID(WebDriver driver) {
		getUserID(driver).click();
	}

	public static void inputUserID(WebDriver driver, String data) {
		getUserID(driver).sendKeys(data);
	}

	// NEW PASSWORD
	public static WebElement getNewPass(WebDriver driver) {

		return driver.findElement(By.xpath(ObjectsPath.REG_NEWPASSWORD));
	}

	public static void clickNewPass(WebDriver driver) {
		getNewPass(driver).clear();
		getNewPass(driver).click();
	}

	public static void inputNewPass(WebDriver driver, String data) {

		getNewPass(driver).sendKeys(data);

	}

	// CONFIRM NEW PASSWORD
	public static WebElement getRepeatPass(WebDriver driver) {

		return driver.findElement(By.xpath(ObjectsPath.REG_REPEATPASSWORD));
	}

	public static void clickRepeatPass(WebDriver driver) {
		getRepeatPass(driver).click();
	}

	public static void inputRepeatPass(WebDriver driver, String data) {
		getRepeatPass(driver).clear();
		getRepeatPass(driver).sendKeys(data);
	}

	// FIRST NAME METHODS
	public static WebElement getFirstName(WebDriver driver) {

		return driver.findElement(By.xpath(ObjectsPath.REG_FIRSTNAME));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void inputFirstName(WebDriver driver, String data) {
		getFirstName(driver).clear();
		getFirstName(driver).sendKeys(data);
	}

	// LAST NAME METHODS
	public static WebElement getLastName(WebDriver driver) {

		return driver.findElement(By.xpath(ObjectsPath.REG_LASTNAME));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void inputLastName(WebDriver driver, String data) {
		getLastName(driver).clear();
		getLastName(driver).sendKeys(data);
	}

	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_EMAIL));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();

	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).clear();
		getEmail(driver).sendKeys(data);
	}

	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_PHONE));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static void inputPhone(WebDriver driver, String data) {
		getPhone(driver).clear();
		getPhone(driver).sendKeys(data);
	}

	public static WebElement getAdress1(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_ADR1));
	}

	public static void clickAdress1(WebDriver driver) {
		getAdress1(driver).click();
	}

	public static void inputAdress1(WebDriver driver, String data) {
		getAdress1(driver).clear();
		getAdress1(driver).sendKeys(data);
	}

	public static WebElement getAdress2(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_ADR2));
	}

	public static void clickAdress2(WebDriver driver) {
		getAdress2(driver).click();
	}

	public static void inputAdress2(WebDriver driver, String data) {
		getAdress2(driver).clear();
		getAdress2(driver).sendKeys(data);
	}

	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_CITY));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).clear();
		getCity(driver).sendKeys(data);
	}

	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_STATE));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).clear();
		getState(driver).sendKeys(data);
	}

	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_ZIP));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	public static void inputZip(WebDriver driver, String data) {
		getZip(driver).clear();
		getZip(driver).sendKeys(data);
	}

	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.REG_COUNTRY));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).clear();
		getCountry(driver).sendKeys(data);
	}

	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(ObjectsPath.REG_LANGUAGE)));
	}

	public static void inputLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}

	public static Select getFavorite(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(ObjectsPath.REG_FAV_CATEGORY)));
	}

	public static void inputFavorite(WebDriver driver, String data) {
		getFavorite(driver).selectByVisibleText(data);
	}

	public static void clickList(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.REG_EML));

	}

	public static void clickBanner(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.REG_EMB));

	}

	public static void clickSave(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.REG_SUBMIT)).click();
	}

	public static void clickACCSave(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.MYACC_SUBMIT)).click();
	}
}
