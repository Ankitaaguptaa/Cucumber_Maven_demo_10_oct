package testsmartfocus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.firefox.FirefoxDriver;

import configurereaddata.ReadData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Screenshot;

public class Test {
	
	
	FirefoxDriver driver;
	ReadData rd=new ReadData();
	
	
	@Given("^open google and enter smart focus in search$")
	public void open_google_and_enter_smart_focus_in_search() throws Throwable {
	    
		System.setProperty("webdriver.gecko.driver", rd.getDriver());
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(rd.getApplication());
		driver.findElement(By.className(rd.getdataXpath())).sendKeys("Smart Focus");
		driver.findElement(By.className(rd.getdataXpath())).sendKeys(Keys.RETURN);
		Screenshot.captureScreenshot(driver);
	
	}

	@When("^click on smart focus link$")
	public void click_on_smart_focus_link() throws Throwable {
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(rd.getSmartLinkXpath())).click();
	}

	@Then("^company page should open$")
	public void company_page_should_open() throws Throwable {
		Thread.sleep(2000);
		System.out.println("Print the Title>>>>>"+driver.getTitle());
		Screenshot.captureScreenshot(driver);
	    
	}

}
