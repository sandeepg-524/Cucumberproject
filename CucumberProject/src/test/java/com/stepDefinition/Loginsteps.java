package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1: User is on Login page");
	   WebDriverManager.firefoxdriver().setup();
	   driver= new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	@When("users enters Username and Password")
	public void users_enters_username_and_password() {
		System.out.println("Step2: user enters username and password");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   
	}

	@And("Click on Login Button")
	public void click_on_login_button() {
		System.out.println("Step3: user is clicking on login button");
		driver.findElement(By.name("Submit")).click();
	   
	}

	@Then("user should land on Home page")
	public void user_should_land_on_home_page() {
		System.out.println("Step4: User lands on home page");
		driver.close();
		
	   
	}
}
