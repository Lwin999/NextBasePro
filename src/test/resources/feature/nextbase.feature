  #@all
Feature: Login Functionality
  Agile story: As a user I should be able to login

  Background: User is on the Login Page
    Given User is logged in and on the home page

  @wip1
  Scenario: User send message with "Message" tab
    When User clicks on "Message" tab
    And User enter any "text" on the "Message" field
    Then User able to click "Send" button

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
    And User able to click "Send" button
    Then poll should be visible in Activity Stream

  @wip5
  Scenario: User should be able to vote for a poll
    When User clicks on "Poll" tab
    And User enter any "text" on the "Poll" field
    And User fills out the "Question" box
    And User fills out the "Answer1" box
    And User fills out the "Answer2" box
    And User able to click "Send" button
    And User clicks selects answer box
    And User clicks "Vote" button
    And User clicks "Vote again" button
    Then User clicks "Stop" button

  @wip6
  Scenario: Users get error message "The message title is not specified"
    When User clicks on "Poll" tab
    And User able to click "Send" button
    Then User able to see error message "The message title is not specified"

  @wip7
  Scenario: Users check "allow multiple Choice" while create a poll
    When User clicks on "Poll" tab
    Then User able to select "allow multiple Choice"

  @wip8
  Scenario: Users can add more questions to a poll
    When User clicks on "Poll" tab
    And User able to click Add question button

  @wip9
  Scenario: Users are able to cancel creating a poll
    When User clicks on "Poll" tab
    And User able to click "Cancel" button

  @wip10
    Scenario: user should be able to search people,document and more from search box
      When user search valid info from search box "employee","doc","post","task"
      And user cannot find info, page should show "Nothing Found"
      Then user gets "Employees","Groups","Menu items","Search" when type a letter

  @wip11
    Scenario: User start time tracking with "Clock In" tab
    When User clicks "Clock In" tab
    When user can edit Todays task under daily plan
    And Should be able to add events


  @wip12
  Scenario: User click Like button for any post
    When User able to click Like button
    And User able to follow a post by clicking "Follow" button
    And User can see who are the people viewed a post with eye icon
    And User able to click star icon to save a post as favorite
    And User can write a comment to a post
    Then User cancel a comment with "Cancel" button





