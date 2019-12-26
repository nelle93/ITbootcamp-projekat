package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddToCart {
	public static void goToReptile (WebDriver driver) {
		driver.get(PageURLs.REPS_URL);
	}
	public static void chooseIguana (WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.IGUANA_PATH)).click();
	}
	public static void addIguana (WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.ADD_CART)).click();
	}
	

}
