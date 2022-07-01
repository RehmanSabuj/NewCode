package SetpDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class VerianzonFios {
	
	WebDriver driver = null;
	
	@Given("open the browser")
	public void open_the_browser() {
		
		System.out.println("user is now in inside browser page");
		
		System.setProperty("webdirver.chrome.driver", "C:/Users/sabuj/eclipse-workspace/SeleniumBDDProject/src/test/resources/drivers/chromedriver.exe");
	   
		driver = new ChromeDriver();
	}

	@Given("user landing log in page")
	public void user_landing_log_in_page() {
		System.out.println("user serarch verizon items");
		System.getProperty("https://www.verizon.com/");
	}
	/**

	@When("user enters login username and password")
	public void user_enters_login_username_and_password() {
	}

	@When("user is able to clicks log in button")
	public void user_is_able_to_clicks_log_in_button() {
	}

	@Then("user is able to navigate desired web page")
	public void user_is_able_to_navigate_desired_web_page() {
	}**/

}
