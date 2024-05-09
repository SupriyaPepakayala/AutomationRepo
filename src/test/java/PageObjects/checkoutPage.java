package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {

	public WebDriver driver;
	
	public checkoutPage(WebDriver driver) {
		this.driver=driver;
			}
	
	By cart=By.cssSelector("img[alt='Cart']");
	By checkout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By applyBut=By.cssSelector("button.promoBtn");
	By order=By.xpath("//button[contains(text(),'Place Order')]");
	By product=By.cssSelector("p.product-name");
	
	public void checkOutItems() {
		driver.findElement(cart).click();
		driver.findElement(checkout).click();
	}
	
	public boolean verifyButtons() {
		 return driver.findElement(applyBut).isDisplayed();
		
	}
	
	public boolean verifyApply() {
		return driver.findElement(order).isDisplayed();
	}
	
	public String verifyElement() {
		return driver.findElement(product).getText();
		}
	
	
}
