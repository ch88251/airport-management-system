package com.cfhayes.ams.web;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


@QuarkusTest
public class AirlineResourceTest {

  @Test
  public void testList() {
    given()
      .when().get("/airlines")
      .then()
      .statusCode(200);
  }
}
