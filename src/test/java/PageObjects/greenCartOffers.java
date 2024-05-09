package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class greenCartOffers {

	public WebDriver driver;
	
	public greenCartOffers(WebDriver driver) {
		this.driver=driver;
		}
	
	By OfferSearch=By.id("search-field");
	By nameofProduct=By.xpath("//tr//td[1]");
	
	public void Offerfield(String offerName)
	{
		driver.findElement(OfferSearch).sendKeys(offerName);	
	}
	 
	public String productText() {
		return driver.findElement(nameofProduct).getText();
	}
}
