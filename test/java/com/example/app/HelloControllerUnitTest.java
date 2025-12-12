package com.example.app;

import com.example.app.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerUnitTest {
  @Test
  void hello_returns_string() {
    HelloController controller = new HelloController();
    assertThat(controller.hello()).isEqualTo("Hello from real-time Java app");
  }
}
