Given(/^The tennis game starts$/) do
end

Then(/^I see the score "(.*?)"$/) do |arg1|
  check_element_exists "* text:'#{arg1}'"
end
