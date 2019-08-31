package co.uk.ebay.StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSteps {
	
	WebDriver driver;
	WebElement Searchfield;
	WebElement SearchButton;
	WebElement SearchResultHeader;
	List<WebElement> firstresult;

	
	
	
	@Given("I hgerave managed to navigate to {string}")
	public void i_have_managed_to_navigate_to(String string) {
		// System.setProperty("webdriver.chrome.driver",  "./lib/chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver ();
		// driver.navigate().to("https://www.ebay.co.uk");
	}
		
		@Given("I have managed to navigate to ebay")
		public void i_have_managed_to_navigate_to_ebay() {

		 // System.setProperty("webdriver.chrome.driver",  "./lib/chromedriver.exe");
			 WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver ();
			driver.navigate().to("https://www.ebay.co.uk");
		   
	}

	@When("I search for trainers")
	public void i_search_for_trainers() {
		//  Searchfield = driver.findElement(By.id("gh-ac"));
		// Searchfield.sendKeys("trainers");
	   
	}

	@When("click search button")
	public void click_search_button() {
		SearchButton = driver.findElement(By.id("gh-btn"));
		SearchButton.click ();
	    
	}

	@Then("I should be taken to result page")
	public void i_should_be_taken_to_result_page() {
		//SearchResultHeader = driver.findElement(By.tagName("h1"));
		//String headertext = SearchResultHeader.getText();
		
		// Assert.assertTrue(headertext.contains("trainers"));
	    
	}

	@Given("I have managed to navigate to “https:\\/\\/www.ebay.co.uk\\/\"")
	public void i_have_managed_to_navigate_to_https_www_ebay_co_uk() {
	
	}

	@When("I type it a search as {string}")
	public void i_type_it_a_search_as(String any) {
		
	    Searchfield = driver.findElement(By.id("gh-ac"));
	    Searchfield.sendKeys(any);
	  
	}

	@Then("I should see {string} result")
	public void i_should_see_result(String result) {
		
		SearchResultHeader = driver.findElement(By.tagName("h1"));
		String headertext = SearchResultHeader.getText();
		
		Assert.assertTrue(headertext.contains(result));
	    
	}
	
	@Then("click the first result on the click")
	public void click_the_first_result_on_the_click() {
		
		firstresult = driver.findElements(By.className("vip"));
		
	firstresult.get(0).click();
	
	}

	@When("I select category as {string}")
	public void i_select_category_as(String cat) {
		//selectcategoey = driver.findElement(.)
	}
	   

	@Then("I should be taken to the {string} page")
	public void i_should_be_taken_to_the_page(String string) {
	}
	    

}
