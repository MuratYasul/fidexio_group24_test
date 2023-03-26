package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.fidexio.utils.ConfigurationReader;
import com.fidexio.utils.Driver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("User enters {string} and {string} for Pos Manager")
    public void user_enters_and_for_pos_manager(String email, String password) {
      Driver.getDriver().get(ConfigurationReader.getProperty("url"));
      loginPage.emailInputBox.sendKeys(email);
      loginPage.passwordInputBox.sendKeys(password);
    }
    @Then("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();

    }
        @When("User enters {string} and {string} for Sales Manager")
    public void userEntersAndForSalesManager(String email, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.emailInputBox.sendKeys(email);
        loginPage.passwordInputBox.sendKeys(password);
    }



}
