package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By returningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");
    By emailId = By.xpath("//input[@id='input-email']");
    By password = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@value='Login']");

    /**
     * get Returning Customer Text
     * @return
     * @throws InterruptedException
     */
    public String getReturningCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(returningCustomer);
    }

    /**
     * enter EmailId
     * @param value
     * @throws InterruptedException
     */
    public void enterEmailId(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(emailId, value);
    }

    /**
     * enter Password
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(password, value);
    }

    /**
     * click On Login
     * @throws InterruptedException
     */
    public void clickOnLogin() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(loginButton);
    }

}
