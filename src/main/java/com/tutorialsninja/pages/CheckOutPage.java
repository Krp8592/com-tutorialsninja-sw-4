package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckOut = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-telephone']");
    By address1 = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    By comments = By.xpath("//textarea[@name='comment']");
    By agree = By.xpath("//input[@name='agree']");
    By warningText = By.xpath("//div[@class='alert alert-warning alert-dismissible']");
    By guestContinueButton = By.xpath("//input[@id='button-guest']");

    /**
     * This method is used to get Check Out Text
     * @return
     * @throws InterruptedException
     */
    public String getCheckOutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(checkOutText);
    }

    /**
     * This method is used to get New Customer Text
     * @return
     * @throws InterruptedException
     */
    public String getNewCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(newCustomerText);
    }

    /**
     * This method is used click on Guest Checkout Button
     * @throws InterruptedException
     */
    public void clickOnGuestCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(guestCheckOut);
    }

    /**
     * This method is used click on  Checkout Button
     * @throws InterruptedException
     */
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    /**
     * This method is used to enter FirstName
     * @param firstnNme
     * @throws InterruptedException
     */
    public void enterFirstName(String firstnNme) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, firstnNme);
    }

    /**
     * This method is used to enter LastName
     * @param name
     * @throws InterruptedException
     */
    public void enterLastName(String name) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, name);
    }

    /**
     * This method is used to enter email
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(email, value);
    }

    /**
     * This method is used to enter phone Number
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(telephone, value);
    }

    /**
     * This method is used to enter  Address1
     * @param value
     * @throws InterruptedException
     */
    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(address1, value);
    }

    /**
     * This method is used to enter city
     * @param value
     * @throws InterruptedException
     */
    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(city, value);
    }

    /**
     * This method is used to enter post code
     * @param value
     * @throws InterruptedException
     */
    public void enterPostCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(postcode, value);
    }

    /**
     * This method is used to select country
     * @param value
     * @throws InterruptedException
     */
    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(country, value);
    }

    /**
     * This method is used to select Region
     * @param value
     * @throws InterruptedException
     */
    public void selectRegion(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(region, value);
    }

    /**
     * click on Guest Continue
     * @throws InterruptedException
     */
    public void clickOnGuestContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(guestContinueButton);
    }

    /**
     * Enter Comment
     * @param value
     * @throws InterruptedException
     */
    public void enterComments(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(comments, value);
    }

    /**
     * This method is used to click agree
     * @throws InterruptedException
     */
    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(agree);
    }

    /**
     * This method is used to get payment warring message
     * @return
     * @throws InterruptedException
     */
    public String getPaymentWarningText() throws InterruptedException {
        Thread.sleep(2000);
        return  getTextFromElement(warningText);
    }

}
