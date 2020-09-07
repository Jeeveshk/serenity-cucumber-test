Feature: Open and select menu

  Scenario: Opening top rated TV shows
    Given user is opening imdb site
    When he clicks on menu
    And he clicks on top rated tv shows
    Then he should see list of top rated tv shows
    
  #Scenario: Search for a TV series
    #Given user is on home page of imdb site
    #When he searches for game of throne series
    #Then list of results are shown amd he selects "Game of Thrones: The Last Watch"