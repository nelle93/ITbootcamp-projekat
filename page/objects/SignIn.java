package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
    // USERNAME METHODS
	public static WebElement getUserName(WebDriver driver) {

		return driver.findElement(By.xpath(ObjectsPath.UserNameLogin));
	}

	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	public static void inputUserName(WebDriver driver, String data) {
		getUserName(driver).sendKeys(data);
	}
	//PASSWORD METHODS
	public static WebElement getPassword(WebDriver driver) {

		return driver.findElement(By.xpath(ObjectsPath.PasswordLogin));
	}
	public static void clickPassword (WebDriver driver) {
		getPassword(driver).click();
		getPassword(driver).clear();
		getPassword(driver).click();
	}
	public static void inputPassword (WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}
	//LOGIN BUTTON METHOD
	public static WebElement getLoginButton (WebDriver driver) {
		
	    return driver.findElement(By.xpath(ObjectsPath.LoginButton));
	}
	public static void clickLoginButton (WebDriver driver) {
		getLoginButton(driver).click();
	}
	//REGISTRATION LINK METHOD
	public static WebElement getRegistrationLink (WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.RegisterLink));
	}
    public static void clickRegistrationLink (WebDriver driver) {
    	getRegistrationLink(driver).click();
    }
    //SIGN OUT METHOD
    public static WebElement getSignOut (WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.SignOutButton));
	}
    public static void clickSignOut (WebDriver driver) {
    	getSignOut(driver).click();
    }
    
}
