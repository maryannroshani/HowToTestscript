package com.learn.cucumber.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPage {

   protected WebDriver driver;

   public AbstractPage (WebDriver driver){
       this.driver = driver;
   }

   public WebDriver getDriver(){
       return driver;
   }

   public HomePage navigateToWebApp(){
       driver.navigate().to("http://www.thetestroom.com/webapp");
       return new HomePage(driver);
   }
}
