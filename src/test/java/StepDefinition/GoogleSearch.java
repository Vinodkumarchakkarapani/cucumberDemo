package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    System.out.println("open browser");}

	@And("user is on google Search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("http://google.com");
		
		System.out.println("open google");}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		Thread.sleep(3000);
		System.out.println(" google search box");}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("click button");}

	@Then("user is navigated to search Results")
	public void user_is_navigated_to_search_results() {
		driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/table/tbody/tr[1]/td/div/h3/a")).click();
		
		  driver.close(); driver.quit();
		 	System.out.println("Results of search");}
}
