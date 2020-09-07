Feature: Search for tv series
  
  Scenario: Search for a TV series
    Given user is opening imdb site
    When he searches for game of throne series
    Then list of results are shown amd he selects "Game of Thrones: The Last Watch"