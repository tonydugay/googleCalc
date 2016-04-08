Feature: Check addition in Google calculator
   In order to verify that google calculator work correctly
   As a user of google
   I should be able to get correct addition result

   @regression
   Scenario: Addition
     Given I open google
     When I enter "2+2" in search textbox
     Then I should get result as "4"


   @smoke @regression
   Scenario: Addition
     Given I open google
     When I enter "2+3" in search textbox
     Then I should get result as "5"