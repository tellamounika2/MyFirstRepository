package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HooksPractice {
	WebDriver driver;
	String url = "";
	
	@Given("navigate to demo automation site")
	public void navigate_to_demo_automation_site() {
		
	}
	
	@Before
	public void setUp() {
		System.out.println("Before any scenario");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		url = "http://demo.automationtesting.in/Index.html";
		driver.get(url);
	}
	
	@After
	public void tearDown() {
		System.out.println("After any scenario");
		driver.quit();
	}
	
	
	@Then("enter the username into username field")
	public void enter_the_username_into_username_field() {
		driver.findElement(By.id("email")).sendKeys("prashanthi@gmail.com");
	    
	}
	
	@Then("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.id("enterimg")).click();  
	}
	
	@Then("verify the registry text")
	public void verify_the_registry_text() {
		if (driver.getTitle().equals("Register")) {
			System.out.println("Text -" + driver.getTitle());
		}
	    
	}

	

}
