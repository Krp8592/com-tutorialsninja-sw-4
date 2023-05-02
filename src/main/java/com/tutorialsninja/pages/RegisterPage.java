package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By accountCreatedText = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By firstName = By.xpath("//input[@id='input-firstname']");
    By lastName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telephone = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By agree = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");

    /**
     * get Register Account Text
     * @return
     * @throws InterruptedException
     */
    public String getRegisterAccountText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(registerAccount);
    }

    /**
     * enter FirstName
     * @param firstnNme
     * @throws InterruptedException
     */
    public void enterFirstName(String firstnNme) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, firstnNme);
    }

    /**
     * enter LastName
     * @param value
     * @throws InterruptedException
     */
    public void enterLastName(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
    }

    /**
     * enter Email
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(email, value);
    }

    /**
     * enter PhoneNumber
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(telephone, value);
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
     * enter ConfirmPassword
     * @param value
     * @throws InterruptedException
     */
    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(confirmPassword, value);
    }

    /**
     * select Subscribe Button
     * @param vaule
     * @throws InterruptedException
     */
    public void selectSubscribeButton(String vaule) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[normalize-space()='" + vaule + "']"));
    }

    /**
     * click On Agree
     * @throws InterruptedException
     */
    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(agree);
    }

    /**
     * click On Continue
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    /**
     * get Account CreatedText
     * @return
     * @throws InterruptedException
     */
    public String getAccountCreatedText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(accountCreatedText);
    }

}
