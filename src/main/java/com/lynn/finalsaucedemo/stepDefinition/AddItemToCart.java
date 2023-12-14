package com.lynn.finalsaucedemo.stepDefinition;

import com.lynn.finalsaucedemo.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart {

  WebDriver driver = new ChromeDriver();
  LoginPage loginPage;

  public AddItemToCart() {
    this.loginPage = new LoginPage(driver);
  }
  @Given("when user logs in successfully to saucedemo")
  public void LoginSauceDemo(){
    loginPage.logIn("standard_user","secret_sauce");
  }

  @When("User clicks on Add to Cart")
  public void clickAddToCartBtn(){
    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
  }
  @Then("Item is successfully added to cart")
  public void viewAddedItem(){
    driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container div.header_secondary_container > span.title")).isDisplayed();
    driver.close();
  }


}
