Feature: Testing Swiggy application for various functionalities
  I want to use this template for my feature file

Background:
Given The user launches Swiggy application

  Scenario: Verify if user is able to select location and restaurant
    When enter the user location and search
    Then enters restaurant details and search
    And selects the restaurant and search item
    
  Scenario: Verify if user is able to add items and checkout
    When search for item
    Then adds item to cart
    And navigates to checkout page
    And checks the total amount
    
  Scenario: Verify if user is able to delete item from cart
    When navigates to cart
    Then check details of items in cart
    And delete the added items