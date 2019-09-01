Feature: Login functionality
  @smoke
  Scenario: Validate user login to Ebay
    Given Validate homepage
    When User navigates to signin page
    Then Verify Sign Page
    When User sign in with valid credentials on sign in page
    Then Verify User on homepage after successfull login


  @smoke
  Scenario: Validate invalid login to Ebay
    Given Validate homepage
    When User navigates to signin page
    Then Verify Sign Page
    When User login with "asifa@gmail.com" and "Test0001" on sign page


  #@smoke
 Scenario Outline: Validate invalid login to Ebay
    Given Validate homepage
    When User navigates to signin page
    Then Verify Sign Page
    When User login with "<userId>" and "<password>" on sign page

    Examples:
    | userId | password |
    | vaishalihthacker49@gmail.com | Test0gh001 |
    |asifa@gmail.com               | Test002  |
    | vaishalihthacker898949@gmail.com | Test0001 |



