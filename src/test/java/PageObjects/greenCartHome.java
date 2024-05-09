package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class greenCartHome {
public WebDriver driver;
	
	public greenCartHome(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.cssSelector("input[placeholder='Search for Vegetables and Fruits']");
	By product=By.cssSelector("h4.product-name");
	By dealLink=By.linkText("Top Deals");
	By increment=By.cssSelector("a.increment");
	By addToCart=By.cssSelector(".product-action button");
	
	public void SearchforProduct(String name) {
		
		driver.findElement(search).sendKeys(name);
	}
	
	public String selectProduct() {
		return driver.findElement(product).getText();
		
		}
	
	public void incrementQunatity(int quantity) {
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
	}
		
	public void cartButton() {
		driver.findElement(addToCart).click();
	}
		

	
	public void topDealspage() {
		driver.findElement(dealLink).click();
	}
	
	public String getTitleofPage() {
		return driver.getTitle();
	}
}
