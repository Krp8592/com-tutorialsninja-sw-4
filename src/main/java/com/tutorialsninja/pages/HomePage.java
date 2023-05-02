package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktops = By.linkText("Desktops");
    By laptopAndNotebooks = By.linkText("Laptops & Notebooks");
    By components = By.linkText("Components");
    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By currencyDropdown = By.xpath("//ul[@class = 'dropdown-menu']/li");
    By accountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
    By myAccount = By.xpath("//h2[normalize-space()='My Account']");



    public String selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(topMenu);
        }
        return menu;
    }

    public void clickOnDesktop(){
        mouseHoverToElementAndClick(desktops);
    }

    public void clickOnLaptopAndNotebooks(){
        mouseHoverToElementAndClick(laptopAndNotebooks);
    }

    public void clickOnComponents(){
        mouseHoverToElementAndClick(components);
    }

    public void selectCurrency(){
        clickOnElement(currency);
        selectByContainsTextFromListOfElements(currencyDropdown, "£Pound Sterling");
    }

    /**
     * get Account Logout Text
     * @return
     * @throws InterruptedException
     */
    public String getAccountLogoutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(accountLogout);
    }

    /**
     * get My Account Text
     * @return
     * @throws InterruptedException
     */
    public String getMyAccountText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(myAccount);
    }


}
