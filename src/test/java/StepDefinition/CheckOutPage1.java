package StepDefinition;



import org.junit.Assert;

import PageObjects.checkoutPage;
import PageObjects.pageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.testContextSetup;

public class CheckOutPage1 {

	testContextSetup testcontextsetup;
	public checkoutPage checkoutpage;
	
	public CheckOutPage1(testContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.checkoutpage=testcontextsetup.pageObjMan.getCheckoutPage();
		}
	
	@Then ("Verify user has ability to enter promo code and place the order")
	public void Verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
		checkoutpage=testcontextsetup.pageObjMan.getCheckoutPage();
		
		Assert.assertTrue(checkoutpage.verifyApply());
		Assert.assertTrue(checkoutpage.verifyButtons());
		
	}
	
	@Then ("^User proceeds to ckeckout and validate (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_items_in_checkout_page(String productN) 
	{
		checkoutpage.checkOutItems();
		
		String productName=checkoutpage.verifyElement().split("-")[0].trim();
		Assert.assertEquals(productName, productN);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
