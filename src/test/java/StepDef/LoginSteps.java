package StepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	WebDriver driver = BaseClass.driver;
	
	@Given("^User has launched the Swag Labs Application$")
	public void user_has_launched_the_swag_labs_application() throws Throwable {
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    
	}
	
	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username_something(String username) throws Throwable {
	    
		WebElement UserName = driver.findElement(By.xpath("//*[@id = 'user-name']"));
        UserName.sendKeys(username);
          
	}
	
	@Then("^User Should be landed on the Products Page$")
	public void user_should_be_landed_on_the_products_page() throws Throwable {
		
		
		WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
		String ActText =  ProductPageTitle.getText();
		String ExpText = "PRODUCTS";
		
		Assert.assertEquals(ExpText, ActText);
	   
	}
	
	@And("^User enters password \"([^\"]*)\"$")
	public void user_enters_password_something(String password) throws Throwable {
	    
		WebElement Password = driver.findElement(By.xpath("//*[@id = 'password']"));
        Password.sendKeys(password); 
	}
	
	@And("^User clicks on Login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id = 'login-button']"));
		LoginButton.click();
	    
	}
	
	 @Then("^User Should be Getting the \"([^\"]*)\"$")
	 public void user_should_be_getting_the_something(String Experror) throws Throwable {
        
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[@data-test='error']"));
		String ActError =  ErrorMsg.getText();
		
		Assert.assertEquals(ActError, Experror);
    }


}
