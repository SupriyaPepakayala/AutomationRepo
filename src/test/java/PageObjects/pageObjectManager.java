package PageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
    
	public WebDriver driver;
	public greenCartHome cartHome;
	public greenCartOffers offerspage;
	public checkoutPage checkoutpage;
	
	public pageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public greenCartHome getLandingPage()
	{
		cartHome=new greenCartHome(driver);
		return cartHome;
	}
	
	public greenCartOffers getOffersPage() {
		offerspage=new greenCartOffers(driver);
		return offerspage;
	}
	
	public checkoutPage getCheckoutPage() {
	 checkoutpage=new checkoutPage(driver);
		return checkoutpage;
	}
}
