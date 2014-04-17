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

When(/^player1 scores (\d+) times$/) do |times|
  times.to_i.times {touch "button id:'player1_scores'"}
end

When(/^player2 scores (\d+) times$/) do |times|
  times.to_i.times {touch "button id:'player2_scores'"}
end
