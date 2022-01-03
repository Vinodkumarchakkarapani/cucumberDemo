package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataExample {
	WebDriver driver;
	@Given("^proceed to login page$")
	public void proceed_to_login_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");    
	}

	@When("^user enters \"([^\"]*)\"and password \"([^\"]*)\"$")
	public void user_enters_admin_and_password(String Username,String Password) {
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}
	@And("^click button$")
	public void click_button() {
		driver.findElement(By.id("btnLogin")).click();  
		}
		
		  @Then("click menu bar Recruitment") public void click_menu_bar_recruitment()
		 throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]")).click();
		 
		// driver.findElement(By.id("menu_admin_Job")).click();
		  }
		  @And("click canditates")
		  public void click_canditate() {
		      driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
		      }

}
