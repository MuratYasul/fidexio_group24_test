@smoke
Feature: Create A New Vehicle Odometer Function

  User Story:As a POSMANAGER, I should be able to create a new Odometer.

  Acceptance Criteria:
  1. Verify that USER can create a new Odometer
  2. User must choose at least a Vehicle to create a Vehicles Odometer.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Odometer Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Odometer Value input box. And it should be displayed as a float number.

  Background: Login as a posmanager
    When User enters "posmanager83@info.com" and "posmanager" for Pos Manager
    Then User clicks login button

