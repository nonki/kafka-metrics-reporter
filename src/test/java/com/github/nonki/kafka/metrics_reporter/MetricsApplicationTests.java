package com.github.nonki.kafka.metrics_reporter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetricsApplicationTests {
	@Test
	void hasGreetings() {
		MetricsApplication subject = new MetricsApplication();
		assertEquals("Hello, World!", subject.getGreeting());
	}
}
