package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.CheckOutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopAndNotebooksTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {

        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        String menuName = "Show AllLaptops & Notebooks";
        //1.2 Click on “Show AllLaptops & Notebooks”
        homePage.clickOnLaptopAndNotebooks();
        homePage.selectMenu(menuName);
        //1.3 Verify the Product price will arrange in High to Low order.
        String exceptedMessage = laptopsAndNotebooksPage.beforeSortPriceHighToLow().toString();
        String actualMessage = laptopsAndNotebooksPage.afterSortPriceHighToLow().toString();
        Assert.assertEquals(exceptedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {

        String menuName = "Show AllLaptops & Notebooks";
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.clickOnLaptopAndNotebooks();
        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.selectMenu(menuName);
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.shotByFilter("Price (High > Low)");
        //2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.selectProduct("MacBook");
        //2.5 Verify the text “MacBook”
        String expectedMessage = "MacBook";
        String actualMessage = laptopsAndNotebooksPage.getMacBookText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooksPage.clickOnAddToCart();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        expectedMessage = "Success: You have added MacBook to your shopping cart!\n";
        actualMessage = laptopsAndNotebooksPage.getSuccessText();
        String[] actualmsg = actualMessage.split("×");
        Assert.assertEquals(expectedMessage, actualmsg[0]);
        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebooksPage.clickOnShoppingCartLink();
        //2.9 Verify the text "Shopping Cart"
        expectedMessage = "Shopping Cart  (0.00kg)";
        actualMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //2.10 Verify the Product name "MacBook"
        expectedMessage = "MacBook";
        actualMessage = shoppingCartPage.getMackBookText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //2.11 Change Quantity "2"
        shoppingCartPage.updateQuantity("2");
        //2.12 Click on “Update” Tab
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        expectedMessage = "Success: You have modified your shopping cart!\n";
        actualMessage = shoppingCartPage.getSuccessText();
        String[] actualmsg1 = actualMessage.split("×");
        Assert.assertEquals(expectedMessage, actualmsg1[0]);
        //2.14 Verify the Total $1,204.00
        expectedMessage = "$1,204.00";
        actualMessage = shoppingCartPage.getMackBookPriceText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //Click on Check out button
        shoppingCartPage.clickOnCheckOutButton();
        //2.15 verify Checkout text
        expectedMessage = "Checkout";
        actualMessage = checkOutPage.getCheckOutText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //2.16 Verify New Customer Text
        expectedMessage = "New Customer";
        actualMessage = checkOutPage.getNewCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage);

        //CheckOut and Fill the details
        checkOutPage.clickOnGuestCheckOut();
        checkOutPage.clickOnContinueButton();
        checkOutPage.enterFirstName("Prime");
        checkOutPage.enterLastName("Testing");
        checkOutPage.enterEmail("michael123@gmail.com");
        checkOutPage.enterPhoneNumber("7733558899");
        checkOutPage.enterAddress1("Anand");
        checkOutPage.enterCity("Tintodan");
        checkOutPage.enterPostCode("78890");
        checkOutPage.selectCountry("Australia");
        checkOutPage.selectRegion("Queensland");
        checkOutPage.clickOnGuestContinue();
        checkOutPage.enterComments("Thank you");
        checkOutPage.clickOnAgree();
        //2.17 Verify warning message
        expectedMessage = "Warning: No Payment options are available. Please contact us for assistance!";
        actualMessage = checkOutPage.getPaymentWarningText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }

}
