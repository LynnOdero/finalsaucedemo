package com.lynn.finalsaucedemo.stepDefinition;

import com.lynn.finalsaucedemo.pageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOutTest {
  private final WebDriver driver = new ChromeDriver();
  LoginPage loginPage;

  public CheckOutTest()
  {
    this.loginPage = new LoginPage(driver);
  }

  @Given("a user successfully logs into the app")
  public void loginUser()
  {
    loginPage.logIn("standard_user", "secret_sauce");

  }

  @Given("User clicks on Add to Cart button")
  public void clickAddToCartBtn(){
    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
  }

  @When("user clicks on the cart icon and views items added to the Cart")
  public void clickCart(){
    driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")).click();
  }
  @And("user clicks on Checkout")
  public void clickCheckout(){
    driver.findElement(By.xpath("//button[@id='checkout']")).click();
  }
  @Then("user can enter checkout information <firstName> <lastName> <Zip>")
  public void enterDetails(){
    driver.findElement(By.cssSelector("#first-name")).sendKeys("Lynn");
    driver.findElement(By.cssSelector("#last-name")).sendKeys("Odero");
    driver.findElement(By.cssSelector("#postal-code")).sendKeys("08025");
  }

  @When("user clicks on Continue")
 public void clickContinueToCheckout(){
    driver.findElement(By.xpath("//input[@id='continue']")).click();
  }

  @Then("User is directed to Checkout overview")
  public void viewCheckOutOverview(){
    driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container div.header_secondary_container > span.title")).isDisplayed();
  }

  @When("user clicks on Finish then user is navigated to Checkout Overview")
  public void clickFinish() throws Exception{
    driver.findElement(By.xpath("//button[@id='finish']")).click();
    Thread.sleep(10000);
    driver.close();
  }
}
