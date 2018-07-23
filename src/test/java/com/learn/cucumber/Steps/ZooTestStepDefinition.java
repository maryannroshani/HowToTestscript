package com.learn.cucumber.Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

public class ZooTestStepDefinition {

    WebDriver driver = null;
    private HomePage homePage;
    private ContactPage contactPage;
    private ContactResultPage contactResultPage;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }


    @Given("I am on the zoo site")
    public void i_am_on_the_zoo_site() throws Throwable {
        homePage = new HomePage(driver);
        homePage.navigateToWebApp();
    }

    @When("I click on {string}")
    public void i_click_on_Contact_link(String link) throws Throwable {
        contactPage = homePage.clickOnContact();
    }


    @And("I enter {string} into the name field")
    public void i_enter_Name_test_into_the_name_field(String value) throws Throwable {
        contactPage.fillName(value);

    }

    @And("I enter {string} into the address field")
    public void i_enter_Address_test_into_the_address_field(String value) throws Throwable {
        contactPage.fillAddress(value);

    }

    @And("I enter {string} into the postcode field")
    public void i_enter_Postcode_test_into_the_postcode_field(String value) throws Throwable {
        contactPage.fillPostcode(value);

    }

    @And("I enter {string} into the email field")
    public void i_enter_Email_test_into_the_email_field(String value) throws Throwable {
        contactPage.fillEmail(value);
    }

    @And("I submit the contact form")
    public void i_submit_the_contact_form() throws Throwable {
        contactResultPage = contactPage.submitForm();
    }

    @Then("I check I am on the confirmation page")
 public void i_check_I_am_on_the_confirmation_page() throws Throwable {
        contactResultPage.getConfirmationMessage();
    }

    @And("I close the browser")
    public void i_close_the_browser() throws Throwable {
        driver.close();
    }

  }


