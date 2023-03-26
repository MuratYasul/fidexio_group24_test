Feature: Create Vehicle Function


  User Story: As a POSMANAGER, I should be able to create a new Vehicle.

  Acceptance Criteria:
  1. Verify that USER can create a new VEHICLE.
  2. User must enter at least Model and License Plate information of the vehicle to create a Vehicle.
  3. If user tries to enter a model which is not on the Model list and click the save button, Create a Model popup should be displayed.
  4. After clicked the save button, the information of the vehicle should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only digits in the Seat Number and the Doors Number input box.

  Background: Login as a posmanager
    When User enters "posmanager79@info.com" and "posmanager" for Pos Manager
    Then User clicks login button

    Scenario:
      When User clicks more button on the homepage
      And User clicks the fleet button from dropdown
