package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	WebDriver driver;
	@When("User enters url as {string}")
	public void user_enters_url_as(String url) 
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);

	}

	@Then("Login page title {string} should be displayed")
	public void login_page_title_should_be_displayed(String exp_title) throws InterruptedException  
	{
		Thread.sleep(3000);
		String act_title = driver.getTitle();
		Assert.assertEquals(exp_title, act_title);
	}

}
