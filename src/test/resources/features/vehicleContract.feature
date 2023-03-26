Feature:
  User story :As a POSMANAGER, I should be able to create a new Vehicle Contracts Function

  1. Verify that USER can create a new Contract. (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
  2. User must choose at least a Vehicle to create a Vehicle Contract.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Contract Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Activation Cost input box. And it should be displayed as a float number.
  8. Service Type should display as Leasing by default.

  Background: User logs in as Pos Manager
    When User enters "posmanager77@info.com" and "posmanager" for Pos Manager
    Then User clicks login button

  Scenario: 1. Verify that USER can create a new Contract. (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
    When user click more button
    And user click Fleet
    And user click Vehicle Costs
    And user click create button
    And User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount

  Scenario: 2. User must choose at least a Vehicle to create a Vehicle Contract.
    When user click more button
    And user click Fleet
    And user click Vehicle Costs
    And user click create button
    And User does not enter Vehicle
    Then user see warning message

    Scenario:  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button,
    Create a Vehicle popup should be displayed.
      When user click more button
      And user click Fleet
      And user click Vehicle Costs
      And user click create button
      And User does not enter Vehicle type "Honda"
      And user click save button
      Then user should see create a vehicle pop up

      Scenario: 4. After clicked the save button, the information of the Contract Details which user entered should be displayed.
        When user click more button
        And user click Fleet
        And user click Vehicle Costs
        And user click create button
        And user enter Vehicle type "Bmw"
        And user click save button
        Then user should see information table

        Scenario:   5. After clicked the Save button,
        Edit button display instead of Save button and Create button display instead of Discard button.
          When user click more button
          And user click Fleet
          And user click Vehicle Costs
          And user click create button
          And user enter Vehicle type Bmw
          And user click save button
          Then user should see edit button
          And user should see Create button

          Scenario: 6. When user clicks the Edit button the form should open by displaying the all the information
          and it be ready to edit.
            When user click more button
            And user click Fleet
            And user click Vehicle Costs
            And user click create button
            And user enter Vehicle type "Bmw"
            And user click save button
            And user click edit button
            Then user should see costs table and edit it

Scenario: 7. User should be able to enter only number in the Total Price input box. And it should be displayed as a float number.
  When user click more button
  And user click Fleet
  And user click Vehicle Costs
  And user click create button

