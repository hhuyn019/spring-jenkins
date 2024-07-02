package com.cogent.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@Test
	void contextLoads() {
		log.debug("Test case execution");
	}

}
