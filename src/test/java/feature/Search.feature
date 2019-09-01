Feature: Search functionality
  #@smoke
  Scenario: Validate user search results on Ebay
    Given user is on ebay homepage
    When user is searching for iphone
    Then user finds search results for iphone
