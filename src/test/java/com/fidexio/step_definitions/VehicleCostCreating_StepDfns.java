package com.fidexio.step_definitions;

import com.fidexio.pages.HomePage;
import com.fidexio.pages.LoginPage;
import com.fidexio.pages.VehicleCostPage;
import com.fidexio.utils.BrowserUtils;
import com.fidexio.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

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
//    @When("user enters a vehicle {string}")
//    public void user_enters_a_vehicle(String vehicle) {//vehicle////YENİDEN ADLANDIRILACAK
//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(vehicleCostPage.vehicle_input_box, vehicle).pause(1000).sendKeys(Keys.TAB).perform();
//        //vehicleCostPage.vehicle_input_box.sendKeys(vehicle+Keys.TAB);
//    }

//    @When("user chooses a vehicle type")
//    public void user_chooses_a_vehicle_type() {////YENİDEN ADLANDIRILACAK
//        vehicleCostPage.typeBtn.click();
//        vehicleCostPage.readyType.click();
//    }

    @When("user enters a vehicle Model {string}")
    public void user_enters_a_vehicle_model(String model) {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(vehicleCostPage.vehicle_input_box, model).pause(1000).sendKeys(Keys.TAB).perform();

    }
    @When("user chooses a vehicle type description")
    public void user_chooses_a_vehicle_type_description() {
        vehicleCostPage.typeBtn.click();
        vehicleCostPage.readyType.click();

    }
    @When("User enters Total Price amount {string}")
    public void user_enters_total_price_amount(String price) {
        vehicleCostPage.total_price.clear();
        vehicleCostPage.total_price.sendKeys(price);
    }
    @Then("user clicks on the save button")
    public void userClicksOnTheSaveButton() {
    vehicleCostPage.save_button.click();

    }

    @When("user  enter a new vehicle model {string} that is not in the list")
    public void user_enter_a_new_vehicle_model_that_is_not_in_the_list(String newModel) {
        vehicleCostPage.vehicle_input_box.sendKeys(newModel);

    }

    @Then("user should see {string} pop up.")
    public void user_should_see_pop_up(String createVhclMsg) {
        Assert.assertEquals(createVhclMsg, vehicleCostPage.createVehiclePopup.getText());

    }

    @Then("user can see {string} page")
    public void user_can_see_page(String costDetails) {
            Assert.assertEquals(costDetails, vehicleCostPage.costDetailsEditPage.getText());



    }

    @Then("user can see edit and create buttons on the page.")
    public void user_can_see_edit_and_create_buttons_on_the_page() {
    BrowserUtils.waitForElement(vehicleCostPage.create_and_edit_button);
    Assert.assertTrue(vehicleCostPage.create_and_edit_button.isDisplayed());
    }
    @Then("user clicks on the edit button")
    public void user_clicks_on_the_edit_button() {
    BrowserUtils.waitForElementClickable(vehicleCostPage.edit_button);
    vehicleCostPage.edit_button.click();

    }
    @Then("user sees the information ready to be edited")
    public void user_sees_the_information_ready_to_be_edited() {
    vehicleCostPage.vehicleCostInfoPage.isDisplayed();

    }
    @Then("user sees a warning message {string} when entered alfanumeric value")
    public void user_sees_a_warning_message_when_entered_alfanumeric_value(String warningMessage) {
        System.out.println("vehicleCostPage.invalidErrorMsg.getText() = " + vehicleCostPage.invalidErrorMsg.getText());

        Assert.assertTrue(vehicleCostPage.invalidErrorMsg.isDisplayed());
     //   Assert.assertEquals(warningMessage, vehicleCostPage.invalidErrorMsg);
    }

    @Then("user sees Total Price amount is a float number")
    public void user_sees_total_price_amount_is_a_float_number() {
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
//
//    @Then("user see Total Price is a float number")
//    public void user_see_total_price_is_a_float_number() {
//        String totalPrice= vehicleCostPage.total_price.getText();
//        System.out.println("total_price = " + totalPrice);
//        Scanner scanner = new Scanner(totalPrice);
//
//
//        scanner.useLocale(Locale.US);
//
//        while (scanner.hasNext()) {
//
//            if (scanner.hasNextFloat()) {
//                System.out.println("Found Float: " + scanner.nextFloat());
//            }
//
//            System.out.println("Not Found Float: " + scanner.next());
//        }
//        scanner.close();
//    }


}




