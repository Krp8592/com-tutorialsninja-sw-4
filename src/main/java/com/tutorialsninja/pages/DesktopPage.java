package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    By desktopTextElement = By.xpath("//h2[contains(text(),'Desktops')]");
    By sortByElement = By.id("input-sort");
    By productsBeforeSorted = By.xpath("//h4/a");
    By productHP = By.xpath("//a[normalize-space()='HP LP3065']");
    By productHPTextElement = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By selectDateElement = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndYearElement = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By nextSymbolElement = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By allDatesElement = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By addedToCartMessage = By.xpath("(//div[@class='alert alert-success alert-dismissible'])[1]");
    By shoppingCartLinkElement = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartTextElement = By.xpath("//div[@id='content']//h1");
    By productNameTextElement = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By deliveryDateTextElement = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By modelTextElement = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By totalTextElement = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");



    public String getDesktopTextElement() {
        return getTextFromElement(desktopTextElement);
    }

    public void sortByElement(String name) {
        selectByVisibleTextFromDropDown(sortByElement, name);
    }

    public List<String> productsNameSorted() {
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(productsBeforeSorted);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
            Collections.reverse(originalProductsName);
        }
        return originalProductsName;
    }

    public List<String> productsNameAfterSorting() {
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(productsBeforeSorted);
        ArrayList<String> sortedProductsName = new ArrayList<>();
        for (WebElement e : products) {
            sortedProductsName.add(e.getText());
            Collections.reverse(sortedProductsName);
        }
        return sortedProductsName;
    }

    public void clickOnProductHP() {
        mouseHoverToElementAndClick(productHP);
    }

    public String getTextFromProductHpElement() {
        return getTextFromElement(productHPTextElement);
    }

    public void waitTillMessageToBeVisible(int time){
        waitUntilVisibilityOfElementLocated(addedToCartMessage, time);
    }

    public void selectDate(String year, String month, String date) {
        clickOnElement(selectDateElement);
        while (true) {
            String monthAndYear = driver.findElement(monthAndYearElement).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextSymbolElement);
            }
        }
        List<WebElement> allDates = driver.findElements(allDatesElement);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCartButton);
    }

    public String getAddedToCartMessage(){
        return getTextFromElement(addedToCartMessage);
    }


    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(shoppingCartTextElement);
    }

    public void clickShoppingCartLinkElement() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(shoppingCartLinkElement);
    }


    public String getProductNameText(){
        return getTextFromElement(productNameTextElement);
    }

    public String getDeliveryDateText(){
        return getTextFromElement(deliveryDateTextElement);
    }

    public String getModelText(){
        return getTextFromElement(modelTextElement);
    }

    public String getTotalText(){
        return getTextFromElement(totalTextElement);
    }
}
