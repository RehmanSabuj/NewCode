package SetpDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemofor {
	WebDriver driver = null;

	@SuppressWarnings("deprecation")
	@When("browser is open for user")
	public void browser_is_open_for_user() {
		System.out.println("Inside step- browser is open");
		
		//String projectPath= System.getProperty("user.dir");
		//System.out.println("Project Path is: "+ projectPath);
		
		System.setProperty("webdriver.chrome.driver","C:/Users/sabuj/eclipse-workspace/SeleniumBDDProject/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.close();
		driver.quit();
		

	}

	@And("user is on login page for user")
	public void user_is_on_login_page_for_user() throws InterruptedException {
		driver.navigate().to("https://www.linkedin.com/");
		
		Thread.sleep(2000);

	}

	@When("user enters username and password for user")
	public void user_enters_username_and_password_for_user() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Mushiur");
		driver.findElement(By.id("password")).sendKeys("12345");
		
		Thread.sleep(2000);

	}
	@And("user clicks on login for user")
	public void user_clicks_on_login_for_user() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		
	
	}

	@Then("user is navigated to the home page for user")
	public void user_is_navigated_to_the_home_page_for_user() throws InterruptedException {
		driver.findElement(By.id("logout")).isDisplayed();
		
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
