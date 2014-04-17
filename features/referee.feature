Feature: Referee feature
  Scenario: I can get the current score when players score
    Given The tennis game starts
    Then I see the score "Love All"
    When player 1 scores
    And player 2 scores
    And player 1 scores
    Then I see the score "Thirty Fifteen"

