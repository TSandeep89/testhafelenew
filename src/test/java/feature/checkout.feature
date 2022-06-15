Feature: checkout process flow
  Scenario: Verify that checkout flow end to end.

    When User enters value a in search box as 26226533.
    Then USer clicks on a search button.
    Then User navigates to a cart-page & clicks on cart button.
    Then A confirmation pop-up opens on a cart-page.
    Then User clicks on a "To the basket of goods" button.
    Then Verifies articles moved to a cart-page.
    Then User clicks on check box.
    Then User scroll down to bottom & clicks on proceed to checkout button.
    Then User moved to My order page & clicks on further button.
    Then User moved to Shipping deatils page & clicks on further button.
    And User moved to Check order page & clicks on Buy button.
