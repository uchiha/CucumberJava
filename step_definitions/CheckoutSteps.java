package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;
import static org.junit.Assert.*;

public class CheckoutSteps
{
	int bananaPrice = 0;
	int applePrice = 0;
	Checkout checkout = new Checkout();
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable
	{
		if(name.startsWith("banana"))
		{
			bananaPrice = price;	
		}
		else
			applePrice = price;
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String fruitName) throws Throwable 
	{
		if(fruitName.startsWith("banana"))
		{
			checkout.add(itemCount, bananaPrice, fruitName);
		}
		else
			checkout.add(itemCount, applePrice, fruitName);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable 
	{
		assertEquals(total, checkout.total());
	}
}