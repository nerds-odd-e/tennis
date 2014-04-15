Given(/^The tennis game starts$/) do
end

Then(/^I see the score "(.*?)"$/) do |arg1|
  check_element_exists "* text:'#{arg1}'"
end

When(/^player 1 scores$/) do
  touch "button id:'player1_scores'"
end

When(/^player 2 scores$/) do
  touch "button id:'player2_scores'"
end