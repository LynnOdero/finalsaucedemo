package com.lynn.finalsaucedemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalsaucedemoApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void add_numbers() {
    Assertions.assertThat(2 + 2).isEqualTo(4);
  }

}
