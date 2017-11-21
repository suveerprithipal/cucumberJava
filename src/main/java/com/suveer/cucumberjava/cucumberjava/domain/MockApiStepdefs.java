package com.suveer.cucumberjava.cucumberjava.domain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MockApiStepdefs {

  @Given("^I call a mock api$")
  public void ICallAMockApi() {
    // something happens
  }

  @When("^I store and verify the resonse$")
  public void iStoreAndVerifyTheResonse(){
    // something happens
  }

  @Then("^I expect a (\\d+) status code returned$")
  public void iExpectAStatusCodeReturned(int arg0){
    // something happens
  }
}
