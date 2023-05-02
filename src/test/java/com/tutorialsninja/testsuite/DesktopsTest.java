package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DesktopsTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.clickOnDesktop();

        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");

        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.sortByElement("Name (Z - A)");

        //1.4 Verify the Product will arrange in Descending order.
        List<String> originalProductsName = desktopPage.productsNameSorted();
        List<String> afterSortByZToAProductsName = desktopPage.productsNameAfterSorting();
        Assert.assertEquals(originalProductsName, afterSortByZToAProductsName, "Products are not sorted according to  Z to A");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {


        // Select currency as £ Pound Sterling
        homePage.selectCurrency();

        //2.1 Mouse hover on Desktops Tab. and click
        homePage.clickOnDesktop();

        //2.2 Click on “Show All Desktops”
        homePage.selectMenu("Show AllDesktops");

        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.sortByElement("Name (A - Z)");

        //2.4 Select product “HP LP3065”
        desktopPage.clickOnProductHP();

        //2.5 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = desktopPage.getTextFromProductHpElement();
        Assert.assertEquals(expectedText, actualText, "HP LP3065 text element is not displayed.");

        //2.6 Select Delivery Date "2023-11-30"
        desktopPage.selectDate("2023", "November", "30");

        //2.7 Click on “Add to Cart” button
        desktopPage.clickOnAddToCart();

        //2.8 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        expectedText = "Success: You have added HP LP3065 to your shopping cart!\n×";
        actualText = desktopPage.getAddedToCartMessage();
        Assert.assertEquals(expectedText, actualText, "Product not added to cart");

        //2.9 Click on link “shopping cart” display into success message
        desktopPage.clickShoppingCartLinkElement();

        //2.10  Verify the text "Shopping Cart"
        expectedText = "Shopping Cart  (1.00kg)";
        actualText = desktopPage.getShoppingCartText();
        Assert.assertEquals(expectedText, actualText, "Shopping cart text is not displayed");


        //2.11 Verify the Product name "HP LP3065"
        expectedText = "HP LP3065";
        actualText = desktopPage.getProductNameText();
        Assert.assertEquals(expectedText, actualText, "Product name text is not displayed");

        //2.12 Verify the Delivery Date "2022-11-30"
        expectedText = "Delivery Date:2023-11-30";
        actualText = desktopPage.getDeliveryDateText();
        Assert.assertEquals(expectedText, actualText, "Delivery date text is not not displayed");

        //2.13 Verify the Model "Product21"
        expectedText = "Product 21";
        actualText = desktopPage.getModelText();
        Assert.assertEquals(expectedText, actualText, "Model text is not displayed");

        //2.14 Verify the Total "£74.73"
        expectedText = "£74.73";
        actualText = desktopPage.getTotalText();
        Assert.assertEquals(expectedText, actualText, "Total text is not displayed");

    }

}
