
Feature: Search and add the products to cart

@OffersPage
Scenario Outline: Search experience for both home and offer pages

Given User is on green cart landing page
When User searched for product with shortname <Name> and extracted actual name of product
When User selected "3" items and added products to the cart 
Then User proceeds to ckeckout and validate <Name> items in checkout page
And Verify user has ability to enter promo code and place the order

Examples:
| Name |
| Tom |
| Carrot  |
