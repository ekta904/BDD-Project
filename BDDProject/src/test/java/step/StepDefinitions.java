 package step;

import amazonImplimentation.Product;
import amazonImplimentation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	Product product;
	Search search;
	@Given("I have a search field on the amazon page")
	public void i_have_a_search_field_on_the_amazon_page() {
	    System.out.println("Step 1 : serach on amazon");
	}

	@When("I search with the product with product name {string} and price {int}")
	public void i_search_with_the_product_with_product_name_and_price(String string, Integer int1) {
		
		System.out.println("Step 2: Search the product name with "+string+" and price "+int1);
		
		product = new Product(string, int1);
	    
	}

	@Then("Product with the same name {string} should displayed")
	public void product_with_the_same_name_should_displayed(Product product) {
	   System.out.println("Step 3: Product name with "+product+" should display");
	   
	   search = new Search();
	   search.displayProduct(product);
	}

}
