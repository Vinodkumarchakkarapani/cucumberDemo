package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class DataTableWithDef {
	WebDriver driver;
	
	@Given("Go to the login page")
	public void go_to_the_login_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");    
	}

	@When("Enter the below Credentials")
	public void enter_the_below_credentials( DataTable dataTable) {
		/*
		 * List<String> credentials=dataTable.asList(String.class); String
		 * Username=credentials.get(0); String Password=credentials.get(1);
		 */	
		List<Map<String,String>> KeyValuepair=dataTable.asMaps(String.class, String.class);
	String username =KeyValuepair.get(0).get("Username");	
	String password =KeyValuepair.get(0).get("Password");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
  
	

	@And("click login button")
	public void click_login_button() {
	driver.findElement(By.id("btnLogin")).click();  
	}


}
