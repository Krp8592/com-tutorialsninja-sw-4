package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.clickOnDesktop();

        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");

        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = desktopPage.getDesktopTextElement();
        Assert.assertEquals(expectedText, actualText, "Desktop text element is not displayed");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {

        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopAndNotebooks();

        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");

        //2.3 Verify the text ‘Desktops’
        String expectedText = "Laptops & Notebooks";
        String actualText = laptopsAndNotebooksPage.getLaptopsAndNotebooksText();
        Assert.assertEquals(expectedText, actualText, "Laptops & Notebooks text element is not displayed");

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        //3.1 Mouse hover on “Components” Tab and click
        homePage.clickOnComponents();

        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        homePage.selectMenu("Show AllComponents");

        //3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = componentsPage.getComponentsTextElement();
        Assert.assertEquals(expectedText, actualText, "Laptops & Notebooks text element is not displayed");

    }


}
