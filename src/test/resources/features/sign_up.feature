Feature: Open and sign up

  Scenario: SignUp to imdb site
    Given user is opening imdb site
    When he clicks on sign up 
    And he clicks on create account
    And fills in the details
    Then he signs up