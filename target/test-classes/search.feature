Feature: Search Feature

  Scenario: Search Feature

    Given customer is on homepage
    When  customer enters desire product
    Then  customer should see desied product
    And   customer clicked on product
    And   customer clicked on addToCart
    And   customer clicked on checkout
