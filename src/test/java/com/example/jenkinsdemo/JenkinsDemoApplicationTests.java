package com.example.jenkinsdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j

class JenkinsDemoApplicationTests {

	@Test
	public void contextLoads() {
		log.info("Test case executing...");
		Assertions.assertEquals(true, true);
	}

}
