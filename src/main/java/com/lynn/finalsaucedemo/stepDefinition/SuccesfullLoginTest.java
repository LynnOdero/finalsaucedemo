package com.lynn.finalsaucedemo.stepDefinition;

import com.lynn.finalsaucedemo.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccesfullLoginTest {

  private final WebDriver driver = new ChromeDriver();
  private LoginPage loginPage;

 public SuccesfullLoginTest(){
   this.loginPage = new LoginPage(driver);
 }
 @Given("user logs in with correct credentials")
 public void loginWithCorrectCredentials(){
   loginPage.logIn("standard_user", "secret_sauce");
 }

  @Then("close browser")
  public void close_browser() {
    loginPage.closeBrowser();
  }
}
