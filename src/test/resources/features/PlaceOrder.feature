Feature: Open Cart Place Order Feature

Scenario: Place an Order
Given User is on Home Page
When User search "Phone"
And User Add Item to Cart
Then Item must be added to cart
