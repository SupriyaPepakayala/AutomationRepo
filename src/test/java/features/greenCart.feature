
Feature: Search and Place the order for products

@SearchPage 
Scenario Outline: Search experience for both home and offer pages

Given User is on green cart landing page
When User searched for product with shortname <Name> and extracted actual name of product
Then User searched for same shortname <Name> in Offers page to check if product exist with same name
And User validate productName matches with Offer page productname

Examples:
| Name |
| Tom  |
| Car  |

