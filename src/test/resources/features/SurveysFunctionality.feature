@irfan
Feature: Verify Survey Functionality as expected
  1. Verify that all buttons work as expected at the survey design stage.
  2. User must enter a survey title to create a survey.
  3. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  4. After clicked the Save button, "Attachment(s)", "Action", "Test Survey", "Print Survey",
  "Share and invite by email" and "View result" buttons should be displayed.
  5. After clicked the Save button, "Add an item" should be not displayed.
  6. User can choose "User can come back in the previous page" and/or "Login required" under the Options tab.
  7. "Survey created" message should be displayed under the survey form sheet, after clicked the save button.
  8. Verify that the user should be able to see created survey is listed after clicking the Surveys module.

  Background:
    Given User enters "posmanager84@info.com" and "posmanager" for Pos Manager
    And User clicks login button
    And user click surveys module button

  Scenario: Verify all buttons work as expected at the survey design stage
    Then verify all button is enable to click

  Scenario: User must enter a survey title to create a survey
    When user click create btn in surveys module
    And user enters empty title and save survey
    And user can not create new survey
    And user type title in the form
    Then user created survey successfully