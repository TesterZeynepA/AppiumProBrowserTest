@Browser

Feature: Login Page Feature

  @CheckComponents
  Scenario: Trendyol Browser
    Given user on Home Page
    Then search for: "saat"
    Then click on fifth product
    Then add to shopping cart
    Then verify that product is on the shoppingCart