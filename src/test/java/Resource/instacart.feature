@instacartpage
Feature: Instacart Page
  This feature file is for instacart.ca page automation

  Scenario: Print the common question and answers in the page.
    Given I open the browser and load the instamart url
    When I scroll to common question
    Then click each question and print the question and answer
