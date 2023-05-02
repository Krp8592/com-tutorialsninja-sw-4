package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText =By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productText =By.xpath("(//a[contains(text(),'HP LP3065')])[2]");
    By mackBookText =By.xpath("(//a[contains(text(),'MacBook')])[2]");
    By modelText =By.xpath("//td[normalize-space()='Product 21']");
    By deliveryDateText =By.xpath("(//small)[2]");
    By quantity =By.xpath("//input[contains(@name,'quantity')]");
    By updateButton =By.xpath("//i[@class='fa fa-refresh']");
    By successText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By priceText =By.xpath("(//td[@class='text-right'][normalize-space()='$122.00'])[4]");
    By mackBookPriceText =By.xpath("(//td[@class='text-right'][normalize-space()='$1,204.00'])[3]");
    By checkOut =By.xpath("//a[@class='btn btn-primary']");

    /**
     * get Shopping Cart Text
     * @return
     * @throws InterruptedException
     */
    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get Product Text
     * @return
     * @throws InterruptedException
     */
    public String getProductText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(productText);
    }

    /**
     * get MackBook Text
     * @return
     * @throws InterruptedException
     */
    public String getMackBookText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(mackBookText);
    }


    /**
     * get ModelText
     * @return
     * @throws InterruptedException
     */
    public String getModelText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(modelText);
    }

    /**
     * get Delivery Date Text
     * @return
     * @throws InterruptedException
     */
    public String getDeliveryDateText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(deliveryDateText);
    }

    /**
     * get Price Text
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(priceText);
    }

    /**
     * update Quantity
     * @param value
     * @throws InterruptedException
     */
    public void updateQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(quantity,value);
        clickOnElement(updateButton);
    }

    /**
     * get Success Text
     * @return
     * @throws InterruptedException
     */
    public String getSuccessText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(successText);
    }

    /**
     * get MackBook PriceText
     * @return
     * @throws InterruptedException
     */
    public String getMackBookPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(mackBookPriceText);
    }

    /**
     * click OnCheck OutButton
     * @throws InterruptedException
     */
    public void clickOnCheckOutButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(checkOut);
    }

}
