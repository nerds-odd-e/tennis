Feature: Referee feature
  Scenario: I can get the current score when players score
    Given The tennis game starts
    Then I see the score "Love All"
    When player1 scores 2 times
    And player2 scores 1 times
    Then I see the score "Thirty Fifteen"

  Scenario: Deuce when both players score same greater than 40
    When player1 scores 3 times 
    And player2 scores 3 times
    Then I see the score "Deuce"



