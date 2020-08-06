
Feature: Rain Check
  I want to use this template to check if it will rain or not


  Scenario: Check for case A having rainy day with checking pressure
    Given the temp is 22.0 degree Celsius
    And the wind speed is 5.0 kmph
    When the pressure is 30.0 inHg
    Then I validate that result is "Rain"

  Scenario: Check for case B having rainy day with no pressure check
    Given the temp is 18.0 degree Celsius
    And the wind speed is 9.0 kmph
    When the pressure is 25.0 inHg
    Then I validate that result is "Rain"
    
  Scenario: Check for case B with no rain with checking pressure
    Given the temp is 16.0 degree Celsius
    And the wind speed is 5.0 kmph
    When the pressure is 25.0 inHg
    Then I validate that result is "No Rain"
    
    
  Scenario: Check for case A with no rain and no pressure check
    Given the temp is 20.5 degree Celsius
    And the wind speed is 1.5 kmph
    When the pressure is 24.0 inHg
    Then I validate that result is "No Rain"
    
  Scenario: Check for case A with no rain with having to check pressure
    Given the temp is 23.0 degree Celsius
    And the wind speed is 4.5 kmph
    When the pressure is 21.2 inHg
    Then I validate that result is "No Rain"
    
  Scenario: Check for case B having rain with pressure check
    Given the temp is 12.0 degree Celsius
    And the wind speed is 6.5 kmph
    When the pressure is 32.0 inHg
    Then I validate that result is "Rain"