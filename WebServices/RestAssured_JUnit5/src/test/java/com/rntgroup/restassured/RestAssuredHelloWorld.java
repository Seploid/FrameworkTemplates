package com.rntgroup.restassured;

import com.rntgroup.pojo.Player;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class RestAssuredHelloWorld {

    @BeforeAll
    public static void setup() {
        RestAssured.requestSpecification = Specification.requestSpecification();
        RestAssured.responseSpecification = Specification.responseSpecification();
    }

    @Test
    public void getMethod() {
        List<Player> players =
                given()
                .when()
                    .get("/api/v1/players")
                .then()
                    .extract().body().jsonPath().getList("data", Player.class);


        assertAll( () -> {

            assertFalse(players.isEmpty(), "List of users is empty.");

            players.stream().forEach(player -> {
                assertFalse(player.getFirst_name().isEmpty(), String.format("Player with %s id doesn't have First Name field", player.getId()));
                assertFalse(player.getLast_name().isEmpty(), String.format("Player with %s id doesn't have Last Name field", player.getId()));
                assertNotNull(player.getTeam(), String.format("Player with %s id doesn't have Team field", player.getId()));
            });

        });

    }

}
