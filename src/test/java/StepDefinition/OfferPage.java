package StepDefinition;



import org.junit.Assert;

import PageObjects.greenCartHome;
import PageObjects.greenCartOffers;
import PageObjects.pageObjectManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.testContextSetup;

public class OfferPage {

	testContextSetup testcontextsetup;
	 public String productName;
	public String offerpageproductName;
	
	public OfferPage(testContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		}
	 
	@When("^User searched for same shortname (.+) in Offers page to check if product exist with same name$")
	
	public void user_searched_for_same_shortname_in_offerspage_to_check_if_product_exist_with_same_name(String productN) throws InterruptedException {
		greenCartHome cartHome=testcontextsetup.pageObjMan.getLandingPage();
		cartHome.topDealspage();
		testcontextsetup.genericUtil.SwitchToWindow();
		greenCartOffers offerspage=testcontextsetup.pageObjMan.getOffersPage();
		offerspage.Offerfield(productN);
		Thread.sleep(1000);
		testcontextsetup.offerpageproductName=offerspage.productText();
		System.out.println(testcontextsetup.offerpageproductName);
		
	}
	
	@Then("User validate productName matches with Offer page productname")
	public void user_validate_productName_matches_with_offerpage_productname() {
		Assert.assertEquals(offerpageproductName,productName);
			
	}
	
	
	
	
	
	
	
	
	
	
}
