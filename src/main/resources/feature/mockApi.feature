
  Feature: Call a mock API and assert a 200ok is returned
    Scenario: I call a mocky api
      Given I call a mock api
      When I store and verify the resonse
      Then I expect a 200 status code returned


