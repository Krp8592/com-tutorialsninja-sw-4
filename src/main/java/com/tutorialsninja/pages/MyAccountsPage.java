package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {

    By myAccount = By.xpath("//span[normalize-space()='My Account']");

    /**
     * This method is used to click on any tab of my account dropdown
     *
     * @param option
     */
    public void selectMyAccountOptions(String option) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(myAccount);
        clickOnElement(By.xpath("(//a[normalize-space()='" + option + "'])[1]"));
    }
}
