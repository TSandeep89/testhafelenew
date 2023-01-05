Feature: Quotation management flow
  Scenario: Verify that Quotation management flow end to end.

    When User click on My Account button.
    Then My Account fly out opens & User clicks on My orders link.
    Then My Account panel opens & User clicks on My offers link.
    Then Lister page opens & User clicks on quote number.
    Then User navigate quote details page & verifies the same.
    And  User navigate to quote item.
    And  User clicks on check box on quote link item.
    And  User clicks on Buy now button & verifies the same.



