Feature: Open and sign up

  Scenario: SignUp to imdb site
    Given user is opening imdb site
    When he clicks on sign up 
    And he clicks on create account
    Then fills in the details and sign up
        | username | email | passwrd |
    		| rogerstev | rogerfreskostev@gmail.com | qwert123 |
