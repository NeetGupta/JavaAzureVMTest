package com.example.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {
  @LocalServerPort
  int port;

  @Test
  public void health_endpoint_should_return_ok() {
    RestTemplate rt = new RestTemplate();
    String url = "http://localhost:" + port + "/api/health";
    String resp = rt.getForObject(url, String.class);
    assertThat(resp).isEqualTo("OK");
  }
}
