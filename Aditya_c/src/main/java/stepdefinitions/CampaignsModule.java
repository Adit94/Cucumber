package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CampaignsModule 
{
	private static final CharSequence erev = null;
	WebDriver driver;
	@Given("User launches the browser")
	public void user_launches_the_browser() 
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@When("he enters url {string}")
	public void he_enters_url(String url) 
	{
		driver.get(url);
	}

	@Then("Login page with title {string} should be displayed")
	public void login_page_with_title_should_be_displayed(String expt_title) throws InterruptedException 
	{
		Thread.sleep(5000);
		String act_title = driver.getTitle();
		Assert.assertEquals(expt_title, act_title,"Login Page Title mismatch");
	}

	@When("he enters username {string} and password {string}")
	public void he_enters_username_and_password(String un, String pwd) 
	{
		driver.findElement(By.id("userName")).sendKeys(un);
		driver.findElement(By.id("passWord")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	}

	@And("It should accept the credentials")
	public void it_should_accept_the_credentials() 
	{
		System.out.println("Credentials are accepted");
	}

	@Then("Home page with title {string} should be displayed")
	public void home_page_with_title_should_be_displayed(String expt_home) throws InterruptedException 
	{
		Thread.sleep(5000);
		String act_home = driver.getTitle();
		Assert.assertEquals(expt_home, act_home,"Home Page Title mismatch");
	}

	@When("he clicks on Campaigns major tab")
	public void he_clicks_on_campaigns_major_tab() 
	{
		driver.findElement(By.linkText("Campaigns")).click();
	}

	@Then("All Campaigns page with title {string} should be displayed")
	public void all_campaigns_page_with_title_should_be_displayed(String expt_ac) throws InterruptedException 
	{
		Thread.sleep(5000);
		String act_ac = driver.getTitle();
		Assert.assertEquals(expt_ac, act_ac,"All Campaigns Page Title mismatch");
	}

	@When("he clicks on New Campaign button")
	public void he_clicks_on_new_campaign_button() 
	{
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
	}

	@Then("Create Campaign page with title {string} should be displayed")
	public void create_campaign_page_with_title_should_be_displayed(String expt_cc) throws InterruptedException 
	{
		Thread.sleep(5000);
		String act_cc = driver.getTitle();
		Assert.assertEquals(expt_cc, act_cc,"All Campaigns Page Title mismatch");
	}

	@And("he enters the Campaign Name as {string}")
	public void he_enters_the_campaign_name_as(String campname) 
	{
		driver.findElement(By.xpath("//input[@name='property(Campaign Name)']")).sendKeys(campname);
	}

	@And("he select an option in the Type dropdown")
	public void he_select_an_option_in_the_type_dropdown() 
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='property(Type)']"));
		Select s = new Select(type);
		s.selectByIndex(1);

	}

	@And("he select an option in the Status dropdown")
	public void he_select_an_option_in_the_status_dropdown() 
	{
		WebElement status = driver.findElement(By.xpath("//select[@name='property(Status)']"));
		Select s = new Select(status);
		s.selectByValue("Complete");
	}

	@When("he enters the Start Date as {string}")
	public void he_enters_the_start_date_as(String sdate) 
	{
		driver.findElement(By.xpath("//input[@name='property(Start Date)']")).sendKeys(sdate);
	}

	@When("he enters the End Date as {string}")
	public void he_enters_the_end_date_as(String edate) 
	{
		driver.findElement(By.xpath("//input[@name='property(End Date)']")).sendKeys(edate);
	}

	@When("he enters the Expected Revenue as {string}")
	public void he_enters_the_expected_revenue_as(String erev) 
	{
		driver.findElement(By.xpath("//input[@name='property(Expected Revenue)']")).sendKeys(erev);
	}

	@When("he enters the Budgeted Cost as {string}")
	public void he_enters_the_budgeted_cost_as(String budcost) 
	{
		driver.findElement(By.xpath("//input[@name='property(Budgeted Cost)']")).sendKeys(budcost);
	}

	@When("he enters the Actual Cost as {string}")
	public void he_enters_the_actual_cost_as(String actcost) 
	{
		driver.findElement(By.xpath("//input[@name='property(Actual Cost)']")).sendKeys(actcost);
	}

	@When("he enters the Expected Response as {string}")
	public void he_enters_the_expected_response_as(String eres) 
	{
		driver.findElement(By.xpath("//input[@name='property(Expected Response)']")).sendKeys(eres);
	}

	@When("he enters the Num Sent as {string}")
	public void he_enters_the_num_sent_as(String num) 
	{
		driver.findElement(By.xpath("//input[@name='property(Num sent)']")).sendKeys(num);
	}

	@When("he clicks on Save button")
	public void he_clicks_on_save_button() 
	{
		driver.findElement(By.xpath("((//input[@value='Save'])[2])")).click();
	}
	@Then("Campaign details page with title {string} should be displayed with the following data:{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void campaign_details_page_with_title_should_be_displayed_with_the_following_data(String expt_cd, String expt_campname, String expt_Type, String expt_Status, String expt_sdate, String expt_edate, String expt_erev, String expt_budcost, String expt_actcost, String expt_eres, String expt_num) throws InterruptedException 
	{
		Thread.sleep(5000);
		SoftAssert soft = new SoftAssert();

		String act_cd = driver.getTitle();
		soft.assertEquals(expt_cd, act_cd,"All Campaigns Page Title mismatch");
		soft.assertEquals(driver.findElement(By.id("value_Campaign Name")).getText(), expt_campname,"Campaign Name mismatch");
		soft.assertEquals(driver.findElement(By.id("value_Type")).getText(), expt_Type,"Type mismatch");
		soft.assertEquals(driver.findElement(By.id("value_Status")).getText(), expt_Status,"Campaign Status mismatch");
		soft.assertEquals(driver.findElement(By.id("value_Start Date")).getText(), expt_sdate,"Start Date mismatch");
		soft.assertEquals(driver.findElement(By.id("value_End Date")).getText(), expt_edate,"End Date mismatch");
		soft.assertEquals(driver.findElement(By.id("value_Expected Revenue")).getText(), expt_erev,"Expected Revenue mismatch");	
		soft.assertEquals(driver.findElement(By.id("value_Budgeted Cost")).getText(), expt_budcost,"Budgeted Cost mismatch");	
		soft.assertEquals(driver.findElement(By.id("value_Actual Cost")).getText(), expt_actcost,"Actual Cost mismatch");	
		soft.assertEquals(driver.findElement(By.id("value_Expected Response")).getText(), expt_eres,"Expected Response mismatch");	
		soft.assertEquals(driver.findElement(By.id("value_Num sent")).getText(), expt_num,"Num sent mismatch");
		soft.assertAll();
	}


}