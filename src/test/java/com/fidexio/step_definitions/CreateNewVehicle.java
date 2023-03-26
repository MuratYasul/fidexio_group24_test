package com.fidexio.step_definitions;

import com.fidexio.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewVehicle {
    HomePage homePage = new HomePage();

    @When("User clicks more button on the homepage")
    public void userClicksMoreButtonOnTheHomepage() {
        homePage.moreBtn.click();
    }

    @And("User clicks the fleet button from dropdown")
    public void userClicksTheFleetButtonFromDropdown() {
        homePage.fleetBtn.click();
    }

}
