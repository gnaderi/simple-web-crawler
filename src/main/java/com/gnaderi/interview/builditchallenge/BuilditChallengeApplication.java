package com.gnaderi.interview.builditchallenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilditChallengeApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(BuilditChallengeApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Starting web crawler...");
		SpringApplication.run(BuilditChallengeApplication.class, args);
	}
}
