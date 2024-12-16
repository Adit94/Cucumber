package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AddAndDeletePotential {
WebDriver driver=BaseClass.driver;
@Given("User should be present in homepage")
public void user_should_be_present_in_homepage() {
   System.out.println(driver.getTitle());
}

@When("he clicks on potential")
public void he_clicks_on_potential() {
	driver.findElement(By.linkText("Potentials")).click();
}

@Then("Potential Page should be displayed")
public void potential_page_should_be_displayed() {
	System.out.println(driver.getTitle());
	}

@When("he clicks on new Potential")
public void he_clicks_on_new_potential() {
	driver.findElement(By.xpath("//input[@value='New Potential']")).click();
}

@Then("New Potential Page should be displayed")
public void new_potential_page_should_be_displayed() {
	System.out.println(driver.getTitle());
}

@When("He enters the potential name as {string}")
public void he_enters_the_potential_name_as(String potentialName) {
	driver.findElement(By.name("property(Potential Name)")).sendKeys(potentialName);
}

@And("He enters the account name as {string}")
public void he_enters_the_account_name_as(String accName) {
	driver.findElement(By.name("property(Account Name)")).sendKeys(accName);
}

@And("he enters the closing date as {string}")
public void he_enters_the_closing_date_as(String closingDate) {
	driver.findElement(By.name("property(Closing Date)")).sendKeys(closingDate);
}

@And("he select an option in the dropdown")
public void he_select_an_option_in_the_dropdown() {
	WebElement stage = driver.findElement(By.name("property(Stage)"));
	Select s=new Select(stage);
	s.selectByIndex(7);
}

@And("he clicks on save button")
public void he_clicks_on_save_button() {
	driver.findElement(By.xpath("//input[@value='Save']")).click();
}

@Then("Potential details page should be displayed")
public void potential_details_page_should_be_displayed() {
System.out.println(driver.getTitle());
}

@When("he clicks on delete button")
public void he_clicks_on_delete_button() {
	driver.findElement(By.name("Delete2")).click();
}

@And("Handles the alert popup")
public void handles_the_alert_popup() {
	driver.switchTo().alert().accept();
}

@And("he clicks on recycle bin link")
public void he_clicks_on_recycle_bin_link() {
}

@Then("recycle bin page should be displayed")
public void recycle_bin_page_should_be_displayed() {
	driver.findElement(By.linkText("Recycle Bin")).click();
}

@When("he clicks on nect next button")
public void he_clicks_on_nect_next_button() {
	driver.findElement(By.linkText("Next")).click();
}

@Then("the deleted potential should be displayed")
public void the_deleted_potential_should_be_displayed() {
	String deletedPotential = driver.findElement(By.xpath("(//td[@class='tableData'][3])[last()]")).getText();
	System.out.println(deletedPotential);
}
}
