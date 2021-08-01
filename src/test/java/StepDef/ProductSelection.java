package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSelection {
	
	WebDriver driver = BaseClass.driver;
	
	  @Given("^User is on Swag Lab application$")
	    public void user_is_on_swag_lab_application() throws Throwable {
	      
		   driver.get("http://www.saucedemo.com/");
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
		  
	    }

	    @Given("^User is on the Productpage$")
	    public void user_is_on_the_productpage() throws Throwable {
	    	
	    	
	    	System.out.println("Landed on Product Page");
	        
	    }

	    @When("^user enters  username \"([^\"]*)\"$")
	    public void user_enters_username_something(String username) throws Throwable {
	    	
	    	WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
	    	UserName.sendKeys("standard_user");
	        
	    }

	    @When("^user selects the Product and clicks on add to cart button \"([^\"]*)\"$")
	    public void user_selects_the_product_and_clicks_on_add_to_cart_button_something(String Product) throws Throwable {
	    	
	    	WebElement btnAddCart = driver.findElement(By.xpath("//*[text() = '" + Product + "']//following ::button[1]"));
	    	btnAddCart.click();
	    	System.out.println("Product added to cart");    	
	    	
	        
	    }

	    @Then("^User should be able to see the Productpage$")
	    public void user_should_be_able_to_see_the_productpage() throws Throwable {
	        
	    }

	    @Then("^Product added successfully to the cart$")
	    public void product_added_successfully_to_the_cart() throws Throwable {
	    	
	    	WebElement Shoppingcart = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
	    	Shoppingcart.click();
	    	System.out.println("Landed in my cart page & able to see the added products");
	        
	    }

	    @Then("^User should be able to see the products in cart$")
	    public void user_should_be_able_to_see_the_products_in_cart() throws Throwable {
	    
	    	WebElement Shoppingcart = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
	    	Shoppingcart.click();
	    	System.out.println("Landed in my cart page & able to see the added products");
	    	
	    	
	    }

	    @And("^user enters  pasword \"([^\"]*)\"$")
	    public void user_enters_pasword_something(String password) throws Throwable {
	    	
	    	WebElement Password = driver.findElement(By.id("password"));
	    	Password.sendKeys("secret_sauce");
	       
	    }

	    @And("^user clicks on Login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	
	    	 WebElement login = driver.findElement(By.xpath("//*[@id='login-button']"));
		     login.click();
	        
	    }

	    @And("^User selects the products and clicks on add to cart button$")
	    public void user_selects_the_products_and_clicks_on_add_to_cart_button(DataTable table) throws Throwable {
	    	
	    	String Product1 = table.cell(1,1) ;
	    	String Product2 = table.cell(2,1) ;
	    	String Product3 = table.cell(3,1) ;
	    	String Product4 = table.cell(4,1) ;
	    	
	    	WebElement product1 = driver.findElement(By.xpath("//*[text() = '" +  Product1 + "']//following::button[1]"));
	    	product1.click();
	    	WebElement product2 = driver.findElement(By.xpath("//*[text() = '" +  Product2 + "']//following::button[1]"));
	    	product2.click();
	    	WebElement product3 = driver.findElement(By.xpath("//*[text() = '" +  Product3 + "']//following::button[1]"));
	    	product3.click();
	    	WebElement product4 = driver.findElement(By.xpath("//*[text() = '" +  Product4 + "']//following::button[1]"));
	    	product4.click();

	    	System.out.println("Products added to my cart");
	    			
	    }

	}
