package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {

WebDriver driver;

	@Given("^I open yahoo website$")
	public void i_open_yahoo_website() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C://Execute//chromedriver_win32//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.yahoo.com/");
	    
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable 
		
		{
		 
	    driver.findElement(By.xpath("//*[@id=\'uh-signin\']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input#login-username.phone-no")).sendKeys(username);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#login-passwd")).sendKeys(password);
	}


	@When("^i click on login$")
	public void i_click_on_login() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button#login-signin")).click();
	}

	@Then("^I should be able to login to yahoo website$")
	public void i_should_be_able_to_login_to_yahoo_website() throws Throwable {
		
			
			
		if(driver.getPageSource().contains("Kusuma"))
		  {
		    System.out.println("Pass");
		  }
		else
		  {
		    System.out.println("Fail");
		  }

	}
}








