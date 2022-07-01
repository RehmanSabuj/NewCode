package SetpDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/sabuj/eclipse-workspace/SeleniumBDDProject/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user search on info");
		driver.navigate().to("https://www.google.com/");
		
	}
	
	

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("user enter book name");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}
		

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("user hitting search bar");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user navigate to the desired page");
		driver.getPageSource().concat("Online Courses");
		
		
		driver.close();
		driver.quit();
		
		
	}

}
