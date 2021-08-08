  #@all
Feature: Login Functionality
  Agile story: As a user I should be able to login


  Background: User is on the Login Page
    Given User is logged in and on the home page

  @wip1
  Scenario: User send message with "Message" tab
    When User clicks on "Message" tab
    And User enter any "text" on the "Message" field
    Then User able to click Send button

  @wip2
  Scenario: User cancel messages
    When User clicks on "Message" tab
    And User enter any "text" on the "Message" field
    Then User able to click Cancel button

  @wip3
  Scenario: User attach link with the link icon
    When User clicks on "Message" tab
    And User able to click link button
    And User able to input Text
    And User able to input Link
    Then User able to click Save button

  @wip4
  Scenario: User create a poll with Q/A

    When User clicks on "Poll" tab
    And User enter any "text" on the "Poll" field
    And User fills out the "Question" box
    And User fills out the "Answer1" box
    And User fills out the "Answer2" box
    And User able to click Send button
    Then poll should be visible in Activity Stream



#
#  @wip5
#  Scenario: Users get error message "The message title is not specified"
# When User clicks on "Poll" tab
#  @wip6
#  Scenario: Users check "allow multiple Choice" while create a poll
#
#  @wip7
#  Scenario: Users can add more questions to a poll
#
#  @wip8
#  Scenario: Users are able to cancle creating a poll

