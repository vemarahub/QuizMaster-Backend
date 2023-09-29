package com.vemara.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.logging.Logger;


@SpringBootApplication
@EnableMongoRepositories
public class QuizApplication {

	private static final String CLASSNAME = QuizApplication.class.getName();
	private static final Logger LOGGER = Logger.getLogger(CLASSNAME);

	public static void main(String[] args) {
		final var METHODNAME = "main";
		LOGGER.entering(CLASSNAME, METHODNAME);
		SpringApplication.run(QuizApplication.class);
		LOGGER.exiting(CLASSNAME, METHODNAME);
	}
}
