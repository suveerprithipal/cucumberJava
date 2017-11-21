
  Feature: Call a mock API and assert a 200ok is returned

    Scenario: I call a mocky api and use 2 different methods to verify its status
      Given I call a mock api
      Then I expect a 200 status code returned
      And I expect the rest-assured test to pass as well


