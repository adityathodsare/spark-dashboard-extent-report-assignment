Feature: Login and addToCart functionality testing

  Scenario: Valid login
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in successfully

  Scenario: Invalid login
    Given user is on login page
    When user enters invalid credentials
    Then error message should be displayed

  Scenario: Add product to cart
    Given user is logged in
    When user adds product to cart
    Then product should be visible in cart

  Scenario: Remove product from cart
    Given user has product in cart
    When user removes product
    Then cart should be empty
