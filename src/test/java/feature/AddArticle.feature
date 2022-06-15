#Add article to cart-page

Feature: Add article to cart-page
  Scenario: Add article to cart-page.

    When User enters value in search box as 26226533.
    Then USer clicks on search button.
    Then User navigates to cart-page & clicks on cart button.
    Then A confirmation pop-up opens on cart-page.
    Then User clicks on "To the basket of goods" button.
    Then Verifies articles moved to cart-page.
    And Use navigates to cart-page.