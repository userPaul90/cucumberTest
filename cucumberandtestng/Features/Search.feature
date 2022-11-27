Feature: google search
Scenario Outline: simple search
Given  I am on the goole home search page
When   I enter  search "<term>"
And    I enter google search button
Then   I receive related search result
Examples:
|term             |
|Quality Assurence|

@smoke
Scenario Outline: simple search
Given  I am on the goole home search page
When   I enter  search "<term>"
And    I enter google search button
Then   I receive related search result
Examples:
|term             |
|Quality Assurence|

Scenario: Shop BustBuy
Given     I am on the BustBuy Home page
When      I click ShopNow
Then      I coud land the page for current deals

