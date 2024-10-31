package com.cfhayes.demo.controller;

import static jakarta.ws.rs.core.Response.Status.OK;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;

import com.cfhayes.demo.utils.TestContainerResource;

@QuarkusTest
@QuarkusTestResource(TestContainerResource.class)
public class FlightControllerTest {

    @BeforeAll
    static void init() {
    }

    @Test
    void testFindAll() {
        given().when()
                .get("/flights")
                .then()
                .statusCode(OK.getStatusCode())
                .body("size()", greaterThan(0))
                .body(containsString("airlineId"))
                .body(containsString("arrivalTime"))
                .body(containsString("departureTime"))
                .body(containsString("destinationAirportId"))
                .body(containsString("flightNumber"))
                .body(containsString("originAirportId"))
                .body(containsString("status"));
    }

}
