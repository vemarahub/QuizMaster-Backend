package com.vemara.quizapp.controller;

import com.vemara.quizapp.constants.QuizConstants;
import com.vemara.quizapp.service.QuizService;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@RestController
public class QuizController {


	private static final String CLASSNAME = QuizController.class.getName();
	private static final Logger LOGGER = Logger.getLogger(CLASSNAME);

	private QuizService quizService;

	public QuizController(QuizService storeConfigService) {
		this.quizService = storeConfigService;
	}



	@GetMapping(value = {QuizConstants.REVIEW_PATH}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getQuizes(
			@PathVariable(value = "productId", required = true) String productId) {

		List<String> response = null/*quizService.get(productId)*/;

		return ResponseEntity.status(HttpStatus.OK).cacheControl(CacheControl.noCache()).body(response);
	}


	@PostMapping(value = QuizConstants.REVIEW_PATH)
	public ResponseEntity<String> createQuizes(
			@PathVariable(value = "productId", required = true) String productId,
			@RequestBody(required = true) String review) {
		String response = /*quizService.createReview(review,productId);*/null;
		return ResponseEntity.status(HttpStatus.OK).cacheControl(CacheControl.noCache()).body(response);


	}


}
