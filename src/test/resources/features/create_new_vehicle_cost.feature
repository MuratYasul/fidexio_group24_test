@murat @smoke
Feature: As a POSMANAGER, I should be able to create a new Vehicle Cost.

Acceptance
1. Verify that USER can create a new Vehicle Costs.
2. User must choose at least a Vehicle to create a Vehicle Cost.
3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
4. After clicked the save button, the information of the Cost Details which user entered should be displayed.
5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
7. User should be able to enter only number in the Total Price input box. And it should be displayed as a float number.



Background: User successfully logged in the account
When User enters "posmanager88@info.com" and "posmanager" for Pos Manager
Then User clicks login button
And user clicks more button
And user clicks fleet button
Then user click Vehicle Costs button
And user clicks create button


Scenario:Verify that USER can create a new Cost.
User must choose at least a Vehicle to create a Vehicle Cost.
When user enters a vehicle Model "Bmw"
And user chooses a vehicle type description
And  User enters Total Price amount "5200"
Then user clicks on the save button


Scenario: If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
When  user  enter a new vehicle model "Subaru" that is not in the list
And  user clicks on the save button
Then user should see "Create a Vehicle" pop up.


Scenario:After clicked the save button, the information of the Vehicle Cost Details which user entered should be displayed.
When user enters a vehicle Model "Bmw"
And user chooses a vehicle type description
And  User enters Total Price amount "5200"
Then user clicks on the save button
And  user can see "Cost Details" page


Scenario: After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
When user enters a vehicle Model "Bmw"
And user chooses a vehicle type description
And  User enters Total Price amount "5200"
Then user clicks on the save button
And user can see edit and create buttons on the page.


Scenario:When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
When user enters a vehicle Model "Bmw"
And user chooses a vehicle type description
And  User enters Total Price amount "5200"
Then user clicks on the save button
And user clicks on the edit button
Then user sees the information ready to be edited


Scenario: User should be able to enter only number in the Total Price input box.
When user enters a vehicle Model "VolvoSUV"
And user chooses a vehicle type description
And  User enters Total Price amount "MY777"
Then user clicks on the save button
Then user sees a warning message "The following fields are invalid:" when entered alfanumeric value


Scenario: Number entered Total Price input box should be displayed as a float number.
When user enters a vehicle Model "Audi"
And user chooses a vehicle type description
And  User enters Total Price amount "5200.00"
Then user clicks on the save button
And user clicks on the edit button
And user sees Total Price amount is a float number