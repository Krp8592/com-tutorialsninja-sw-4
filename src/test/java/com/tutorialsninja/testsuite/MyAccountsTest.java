package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class MyAccountsTest extends BaseTest {

    String email;
    MyAccountsPage myAccountPage = new MyAccountsPage();
    RegisterPage registerPage = new RegisterPage();

    LoginPage loginPae = new LoginPage();

    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        String option = "Register";
        myAccountPage.selectMyAccountOptions(option);
        String expectedMessage = "Register Account";
        String actualMessage = registerPage.getRegisterAccountText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        String option = "Login";
        //Click on My Account Link
        myAccountPage.selectMyAccountOptions(option);

        //Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = loginPae.getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String option = "Register";
        //Clickr on My Account Link.
        myAccountPage.selectMyAccountOptions(option);
        //Enter First Name
        registerPage.enterFirstName("Prime");
        //Enter Last Name
        registerPage.enterLastName("Testing");
        //Enter Email
        registerPage.enterEmail(email);
        //Enter Telephone
        registerPage.enterPhoneNumber("7788995566");
        //Enter Password
        registerPage.enterPassword("Asdf1234");
        //Enter Password Confirm
        registerPage.enterConfirmPassword("Asdf1234");
        //Select Subscribe Yes radio button
        registerPage.selectSubscribeButton("Yes");
        //Click on Privacy Policy check box
        registerPage.clickOnAgree();
        //Click on Continue button
        registerPage.clickOnContinue();
        //Verify the message “Your Account Has Been Created!”
        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = registerPage.getAccountCreatedText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //CLick on logout
        option = "Logout";
        myAccountPage.selectMyAccountOptions(option);
        //Verify the text “Account Logout
        expectedMessage = "Account Logout";
        actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //Click on My Account Link.
        String option = "Login";
        myAccountPage.selectMyAccountOptions(option);
        //Provide Login Details
        loginPae.enterEmailId("michael12@gmail.com");
        loginPae.enterPassword("Asdf1234");

        //Click on login button
        loginPae.clickOnLogin();

        //Verify text “My Account”
        String expectedMessage = "My Account";
        String actualMessage = homePage.getMyAccountText();
        Assert.assertEquals(expectedMessage, actualMessage);

        //Click on logout
        option = "Logout";
        myAccountPage.selectMyAccountOptions(option);

        //Click on Continue button
        expectedMessage = "Account Logout";
        actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
