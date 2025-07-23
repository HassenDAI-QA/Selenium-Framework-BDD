@Auth
Feature: authentication of the e-commerce Web Amazon
  As a user, i want to login to the home page
  
  Background: 
    Given I connect to the Amazon application
    And I accept cookies
    When I click on list account

  @ValidAuth
  Scenario: Login with valide credentials
    
    When I fill Email "khlifi.amira94@gmail.com"
    And I click on continue
    And I fill password "amira1234"
    And I click on login
    Then I m in the home page "Bonjour amira"

  @MultiConnection
  Scenario Outline: Multiconnection
    
    When I fill Email "<email>"
    And I click on continue
    And I fill password "<pwd>"
    And I click on login
    Then I m in the home page "<message>"

    Examples: 
      | email                    | pwd          | message       |
      | khlifi.amira94@gmail.com | amira1234    | Bonjour amira |
      | guerbej.henda@gmail.com  | 11 Amazon    | Bonjour Henda |
      | omarnechmii@gmail.com    | omar123      | Bonjour Omar  |
      | asmachouk88@gmail.com    | bonjour12345 | Bonjour Chouk |
