package com.lynn.finalsaucedemo.stepDefinition;

import com.lynn.finalsaucedemo.pageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveItemFromCartTest {
  private final WebDriver driver = new ChromeDriver();
  LoginPage  loginPage;

  public RemoveItemFromCartTest(){
    this.loginPage = new LoginPage(driver);
  }
  @Given("when user logs to the app")
  public void logIntoTheApp(){
    loginPage.logIn("standard_user", "secret_sauce");
  }

  @When("user add item to the Cart")
  public void addToCart(){
    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
  }
  @And("user clicks on the cart icon")
  public void clickOnCartIcon(){
    driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
  }
  @Then("user clicks on Remove, item is removed successfully")
  public void removeBtn(){
    driver.findElement(By.cssSelector("#remove-sauce-labs-bike-light")).click();
    driver.close();
  }


}
