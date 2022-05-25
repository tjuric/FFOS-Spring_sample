package com.infobip.sample.ffosspring_sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This is a sample of integration test
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FfosSpringSampleControllerITTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void getHello() {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Pozdrav FFOS-u iz Spring Boot aplikacije! <br/>" +
                "Brojevi na koje će se slati SMS: +385997778888,+385951112222");
    }
}
