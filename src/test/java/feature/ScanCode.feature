Feature: EAN/QR Scan Code
  Scenario: Verify that EAN/QR Scan flow end to end.

    Given User clicks on My profile button & flyout gets open.
    Then  User clicks on My wishlist link.
    Then  User navigates to My Wishlist page.
    Then  User scroll down the page & clicks on checkboxes.
    Then  User clicks on DownloadEAN/QR code link button.
    Then  Verifies pop-up opens & gets option to choose between QR & EAN code.
    Then  User clicks on QR or EAN scan code
    Then  User clicks on drop down filter & choose the QR/EAN scanner
