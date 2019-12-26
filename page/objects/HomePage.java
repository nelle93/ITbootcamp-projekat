package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
	
	public static void openHomePage (WebDriver driver) {
		driver.get(PageURLs.URL);
	}
	
	public static void navigateToHP(WebDriver driver) {
		driver.navigate().to(PageURLs.URL);
		
	}
	public static void clickStoreIcon (WebDriver driver) {
		
		driver.findElement(By.xpath(ObjectsPath.EnterStorePath)).click();
		
	}

}
