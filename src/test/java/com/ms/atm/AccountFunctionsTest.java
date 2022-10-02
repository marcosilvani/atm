package com.ms.atm;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AccountFunctionsTest {

	@Test
	public void testAccountHTTP404Endpoint() {
		given()
				.when()
					.get("/atm/api/account")
				.then()
					.statusCode(404)
					.body(is(""));
	}

	@Test
	public void testCreateEndpoint() {
		given()
				.when()
					.put("/atm/api/account/create")
				.then()
					.statusCode(200)
					.body(is("Account Functions - create()"));
	}

}
