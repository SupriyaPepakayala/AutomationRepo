package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import PageObjects.greenCartHome;
import PageObjects.pageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.testContextSetup;

public class HomePage {

	public String productName;
	testContextSetup testcontextsetup;
	public greenCartHome cartHome;
	
	public HomePage(testContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.cartHome=testcontextsetup.pageObjMan.getLandingPage();		
		}
	
	@Given ("User is on green cart landing page")
	public void User_is_on_green_cart_landing_page() throws IOException {
		testcontextsetup.testBase.Intialization();
		 Assert.assertTrue(cartHome.getTitleofPage().contains("GreenKart - veg and fruits kart"));
		}
	
	@When ("^User searched for product with shortname (.+) and extracted actual name of product$")
	public void user_searched_for_product_with_shortname_and_extracted_actual_name_of_product(String productN) throws InterruptedException {
		cartHome.SearchforProduct(productN);
		Thread.sleep(1000);
		testcontextsetup.productName=cartHome.selectProduct().split("-")[0].trim();
		System.out.println(testcontextsetup.productName);
	}
	
	@When ("User selected {string} items and added products to the cart")
	public void user_selected_3_items_and_added_products_to_the_cart(String qunatity) {
		cartHome.incrementQunatity(Integer.parseInt(qunatity));
		cartHome.cartButton();
		
	}
	
	
	
	
	
	
}
