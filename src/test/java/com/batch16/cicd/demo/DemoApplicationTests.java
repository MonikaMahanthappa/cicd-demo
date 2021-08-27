package com.batch16.cicd.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void test() {
		assertEquals(2, 1 + 1);
	}

	@Test
	void anotherTest() {
		assertEquals(2, 1 + 1);
	}

	@Test
	void yetAnotherTest() {
		assertEquals(2, 1 + 1);
	}
}
