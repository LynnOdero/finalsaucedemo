package com.lynn.finalsaucedemo.stepDefinition;

import com.lynn.finalsaucedemo.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LockedOutUserLogin {
  private final WebDriver driver = new ChromeDriver();

  LoginPage loginPage;
  public LockedOutUserLogin(){
    this.loginPage = new LoginPage(driver);
  }
  @Given("User logs in with incorrect credentials")
  public void incorrectCredLogin(){
    loginPage.logIn("locked_out_user", "secret_sauce");
  }

  @Then("user should be able to see an error message")
  public void displayErrorMessage(){
 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]")).isDisplayed();
 driver.close();
  }




}
