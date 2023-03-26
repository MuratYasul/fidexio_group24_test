package com.fidexio.step_definitions;

import com.fidexio.pages.HomePage;
import com.fidexio.pages.LoginPage;
import com.fidexio.pages.VehicleCostPage;
import com.fidexio.utils.BrowserUtils;
import com.fidexio.utils.ConfigurationReader;
import com.fidexio.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;
import java.util.Scanner;

public class VehicleCostCreating_StepDfns {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();
    VehicleCostPage vehicleCostPage = new VehicleCostPage();

    @Then("user clicks more button")
    public void user_clicks_more_button() {
        homePage.moreBtn.click();
    }
    @Then("user clicks fleet button")
    public void user_clicks_fleet_button() {
        homePage.fleetBtn.click();
    }
    @Then("user click Vehicle Costs button")
    public void user_click_vehicle_costs_button() {
        vehicleCostPage.vehicleCostBtn.click();
        BrowserUtils.sleep(1);
    }
    @Then("user clicks create button")
    public void user_clicks_create_button() {
      BrowserUtils.waitForElementClickable(vehicleCostPage.createNewBtn);
       vehicleCostPage.createNewBtn.click();
    }
    @When("user enters a vehicle {string}")
    public void user_enters_a_vehicle(String vehicle) {//vehicle
        vehicleCostPage.vehicle_input_box.sendKeys(vehicle+Keys.TAB,Keys.ENTER);
    }
    @When("user chooses a vehicle type")
    public void user_chooses_a_vehicle_type() {
        vehicleCostPage.typeBtn.click();
        vehicleCostPage.readyType.click();
    }
    @When("User enters Total Price {string}")
    public void user_enters_total_price(String price) {
        vehicleCostPage.total_price.sendKeys(price);
    }
    @Then("user clicks the save button")
    public void user_clicks_the_save_button() {
        BrowserUtils.waitForElementClickable(vehicleCostPage.save_button);
        vehicleCostPage.save_button.click();
    }

    @When("user  enter a vehicle that is not in the list {string}")
    public void user_enter_a_vehicle_that_is_not_in_the_list(String newModel) {
        vehicleCostPage.vehicle_input_box.sendKeys(newModel);
    }

    @Then("user should see {string} pop up.")
    public void user_should_see_pop_up(String createVhclMsg) {
       Assert.assertEquals(createVhclMsg, vehicleCostPage.createVehiclePopup);

    }

     @Then("user can see {string}")
    public void user_can_see(String costDetails) {
        Assert.assertEquals(costDetails, vehicleCostPage.costDetailsEditPage);
    }
    @Then("user can see edit and create buttons.")
    public void user_can_see_edit_and_create_buttons() {
        vehicleCostPage.create_and_edit_button.isDisplayed();

    }
    @Then("user see information ready to be edited")
    public void user_see_information_ready_to_be_edited() {
        vehicleCostPage.vehicleCostInfoPage.isDisplayed();
    }

    @Then("user see a warning message when entered alfanumeric value {string}")
    public void user_see_a_warning_message_when_entered_alfanumeric_value(String noNumeric) {
        vehicleCostPage.invalidErrorMsg.isDisplayed();
        String actual_message=vehicleCostPage.invalidErrorMsg.getText();
        Assert.assertEquals(vehicleCostPage.vehicleCostInfoPage,actual_message);
    }

    @Then("user clicks edit button")
    public void user_clicks_edit_button() {
        vehicleCostPage.edit_button.click();

    }
    @Then("user see Total Price is a float number")
    public void user_see_total_price_is_a_float_number() {
        String totalPrice= vehicleCostPage.total_price.getText();
        System.out.println("total_price = " + totalPrice);
        Scanner scanner = new Scanner(totalPrice);


        scanner.useLocale(Locale.US);

        while (scanner.hasNext()) {

            if (scanner.hasNextFloat()) {
                System.out.println("Found Float: " + scanner.nextFloat());
            }

            System.out.println("Not Found Float: " + scanner.next());
        }
        scanner.close();
    }
}



