package com.suveer.cucumberjava.cucumberjava.domain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static io.restassured.RestAssured.get;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class MockApiStepDefs {

  // Create a mock api response using mocky.
  private String mockApiURL = "http://www.mocky.io/v2/5a1498902e00006a00eab3f9";

  // Entities required for making a rest call
  private RestTemplate restTemplate = new RestTemplate();
  private ResponseEntity<String> responseEntity;

  @Given("^I call a mock api$")
  public void ICallAMockApi() {
    responseEntity = restTemplate.getForEntity(mockApiURL,String.class);
  }

  @Then("^I expect a (\\d+) status code returned$")
  public void iExpectAStatusCodeReturned(int arg0){
    // Validating the status code using JUnit and Spring HTTPStatus
    assertThat(responseEntity.getStatusCode(),equalTo(HttpStatus.OK));
  }

  @Then("^I expect the rest-assured test to pass as well$")
  public void iExpectTheRestAssuredTestToPassAsWell(){
    /* Making a rest call and validating it has never been so simple.
       A 1 liner can make your rest call as well as validate it.
       Below, we use rest-assured to test that the API returns a 200 as we did above.
     */
    get(mockApiURL).then().statusCode(200);

  }
}
