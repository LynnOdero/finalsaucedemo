package com.lynn.finalsaucedemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private final WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }


  public void browseURL(){
    driver.get("https://www.saucedemo.com/");
  }


  public void getUsername(String username){
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
  }


  public void enterPassword(String password){
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
  }

  public void clickLogin(){
    driver.findElement(By.xpath("//input[@id='login-button']")).click();
  }


  public void logIn(String username, String password){
    browseURL();
    getUsername(username);
    enterPassword(password);
    clickLogin();
  }

  public void closeBrowser() {
    driver.close();
  }

}
