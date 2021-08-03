Feature: Login Functionality
  Agile story: As a user I should be able to login

  Background: User is on the Login Page
    Given User is logged in and on the home page



  Scenario: User send message with "Message" tab
    When User clicks on "Message" tab
    And User enter any "text" on the "Message" field
    Then User able to click Send button

