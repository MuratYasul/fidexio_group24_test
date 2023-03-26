Feature: As a POSMANAGER, I should be able to create a new Vehicle Contract.
  1. Verify that USER can create a new Contract. (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
  2. User must choose at least a Vehicle to create a Vehicle Contract.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Contract Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Activation Cost input box. And it should be displayed as a float number.
  8. Service Type should display as Leasing by default.

  Background: User succesfully logged in the account
    When User enters "posmanager82@info.com" and "posmanager" for Pos Manager
    Then User clicks login button

    Scenario: Verify that USER can create a new Contract. (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
