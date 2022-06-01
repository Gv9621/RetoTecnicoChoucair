@stories
  Feature: uTest Project
    As a user, I want to get into uTest website and create a new user
    @scenario1
    Scenario: Create a new user
      Given that jose wants to create a new user in uTest website
      When he fills out the form to create a new user
      Then he sees a button indicating Resend Confirmation Email which means his account was created but he needs to confirm first