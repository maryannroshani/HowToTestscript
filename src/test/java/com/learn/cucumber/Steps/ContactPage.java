package com.learn.cucumber.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage {

    public ContactPage(WebDriver driver)

    {
        super(driver);
    }

    public ContactPage fillName(String value) {
        driver.findElement(By.name("name_field")).sendKeys(value);
        return this;
    }

    public ContactPage fillAddress(String value) {
        driver.findElement(By.name("address_field")).sendKeys(value);
        return this;
    }

    public ContactPage fillPostcode(String value) {
        driver.findElement(By.name("postcode_field")).sendKeys(value);
        return this;
    }

    public ContactPage fillEmail(String value) {
        driver.findElement(By.name("email_field")).sendKeys(value);
        return this;
    }


    public ContactResultPage submitForm() {
        driver.findElement(By.id("submit_message")).click();
        return new ContactResultPage(driver);
    }
}
