package org.example;


import org.testng.annotations.Test;

public class TestSuite extends BaseTest {


    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();

    BuildYourOwnSelection buildYourOwnSelection = new BuildYourOwnSelection();

    EmailAFriend emailAFriend = new EmailAFriend();
    
    RegisterResultPage registerResultPage = new RegisterResultPage();

    ReferAFriendProducts referAFriend = new ReferAFriendProducts();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();

        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify
        registerResultPage.verifyUserRegisteredSuccessfully();


    }

    @Test
    public void verifyRegisteredUserShouldLogin() {

      //  registerPage.registrationForLogin();
        homePage.logInUser();
    }

    @Test
    public void verifyRegisteredUserShouldReferAProduct() {

        homePage.logInUser(); //log in from login details previously used
        referAFriend.referAProductComputer(); //Camera-photo product referral in this case.
        emailAFriend.referFriend();
    }

    @Test
    public void verifyBuildMyOwnComputerSuccessful() {
        //open product from homepage
        homePage.clickOnBuildMyOwnComputer();//
        // selecting second option of the selected product to be added in cart
        buildYourOwnSelection.computerAdding();
        //verifying same product in shopping cart.
         shoppingCartPage.verifyShoppingCartPage();




    }

}
