package co.uk.ebay.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PaymentSteps {
	
	WebDriver driver;

	@Given("that I am able to get unto “https:\\/\\/www.next.co.uk\\/\"")
	public void that_I_am_able_to_get_unto_https_www_next_co_uk() {
		System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.next.co.uk");
		

	}

	@Given("managed to get to the checkout page")
	public void managed_to_get_to_the_checkout_page() {
	  
	}

	@Given("register as a new customer")
	public void register_as_a_new_customer() {
	  
	}

	@Given("selected a delivery method")
	public void selected_a_delivery_method() {
	    
	}

	@When("I enter valid  visa card number")
	public void i_enter_valid_visa_card_number() {
	   
	}

	@When("enter a valid name")
	public void enter_a_valid_name() {
	    
	}

	@When("enter a valid expiry date")
	public void enter_a_valid_expiry_date() {
	   
	}

	@When("enter valid security code")
	public void enter_valid_security_code() {
	    
	}

	@When("I click the payment button")
	public void i_click_the_payment_button() {
	
	}

	@Then("i should be taken to the payment successful page")
	public void i_should_be_taken_to_the_payment_successful_page() {
	    
	}
}
