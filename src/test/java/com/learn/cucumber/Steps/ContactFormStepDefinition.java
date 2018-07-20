package com.learn.cucumber.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactFormStepDefinition {


    WebDriver driver = null;

    @Given("I am on the zoo website")
    public void shouldNavigateToTheZooSite() throws Throwable {
        driver = new ChromeDriver();
        driver.navigate().to("http://www.thetestroom.com/webapp/");
    }

//    @And("I close the browser")
//    public void shouldCloseTheBrowser() throws Throwable {
//        driver.close();
//    }

    @When("I click the link {string}")
    public void shouldClickLink(String link) throws Throwable {
        driver.findElement(By.id(link)).click();
    }

    @Then("I check page title is {string}")
    public void CheckPageTitle(String title) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(title));
    }
}

