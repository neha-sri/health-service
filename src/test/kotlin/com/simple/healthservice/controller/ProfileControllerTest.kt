package com.simple.healthservice.controller

import com.simple.healthservice.model.Profile
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest
class ProfileControllerTest {
    @Autowired
    lateinit var controller: ProfileController
    lateinit var client: WebTestClient
    lateinit var profile: Profile

    @BeforeEach
    fun setup() {
        client = WebTestClient.bindToController(controller).build()
    }

    @Test
    fun whenRequestProfile_thenStatusShouldBeOk() {
        client.post()
            .uri("/profile")
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue(profile)
            .exchange()
            .expectStatus().isOk
    }
}