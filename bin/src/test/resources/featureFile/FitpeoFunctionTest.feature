@revenuePage
Feature: Testing slider section in Revenue Calculator Page
  @revenuePageValidation
  Scenario: Validate the  Revenue Calculator Page
    Given  User is on Home Page of Fitpeo
    When  User click on Revenue Calculator Menu button
    Then  User lands on Revenue-Calculator page

 Scenario: Validate the Slider Bar functionality on Revenue Calculator Page
   Then User scroll the page till slide bar is visible
   When User try to slide the bar as requested by  user
   Then  User should able to adjust the bar
   And Value should be updated in text field

@revenuePagetextField
  Scenario: Validate the Slider Text Field functionality on Revenue Calculator Page

   When  User try to enter the value in text field as requested by  user
    Then  User should able to update the field
    And Value slider should be adjusted according to the text field value <--