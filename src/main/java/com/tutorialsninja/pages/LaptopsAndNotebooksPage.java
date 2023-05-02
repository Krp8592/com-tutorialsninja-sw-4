package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

    By shortFilter = By.xpath("//select[@id='input-sort']");
    By productText =By.xpath("//h1[normalize-space()='MacBook']");
    By addTocart =By.xpath("//button[@id='button-cart']");
    By successText =By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By allLaptopsAndNotebooks=By.xpath("//h2[normalize-space()='Laptops & Notebooks']");

    /**
     *
     * @return
     * @throws InterruptedException
     */
    public List<Double> beforeSortPriceHighToLow() throws InterruptedException {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        return originalProductsPrice;
    }

    /**
     *
     * @return
     * @throws InterruptedException
     */
    public List<Double> afterSortPriceHighToLow() throws InterruptedException {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        return afterSortByPrice;
    }

    /**
     * shot By Filter
     * @param value
     */
    public void shotByFilter(String value) {
        selectByVisibleTextFromDropDown(shortFilter, value);
    }

    /**
     * select Product
     * @param product
     */
    public void selectProduct(String product) {
        clickOnElement(By.xpath("//a[normalize-space()='" + product + "']"));
    }

    /**
     * get MacBook Text
     * @return
     * @throws InterruptedException
     */
    public String getMacBookText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(productText);
    }

    /**
     * click On Add To Cart
     */
    public void clickOnAddToCart() {
        clickOnElement(addTocart);
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
     * click On Shopping CartLink
     * @throws InterruptedException
     */
    public void clickOnShoppingCartLink() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(shoppingCartLink);
    }

    /**
     * get Laptops And Notebooks Text
     * @return
     * @throws InterruptedException
     */
    public String getLaptopsAndNotebooksText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(allLaptopsAndNotebooks);
    }
}
