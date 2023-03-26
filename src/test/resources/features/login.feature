Feature: Login

  Scenario: User logs in as Pos Manager
    When User enters "posmanager88@info.com" and "posmanager" for Pos Manager
    Then User clicks login button
#
#  Scenario: User logs in as SalesManager
#    When User enters "salesmanager88@info.com" and "salesmanager" for Sales Manager
#    Then User clicks login button
