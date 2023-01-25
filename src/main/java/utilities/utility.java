package utilities;

import org.openqa.selenium.WebElement;

public class utility {

	public static void sendkey(WebElement element, String text) {

		element.sendKeys(text);
	}
}
