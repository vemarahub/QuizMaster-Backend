package com.vemara.quizapp.controller;

import com.vemara.quizapp.objects.QuestionsDTO;
import com.vemara.quizapp.objects.QuizDTO;
import com.vemara.quizapp.objects.UserDTO;
import com.vemara.quizapp.objects.UserResponseDTO;
import com.vemara.quizapp.service.QuestionService;
import com.vemara.quizapp.service.QuizService;
import com.vemara.quizapp.service.UserResponseService;
import com.vemara.quizapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizmaster")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private UserService userService;

	@Autowired
	private UserResponseService userResponseService;

	// Quizzes API Endpoints

	@PostMapping("/createQuiz")
	public Boolean createQuiz(@RequestBody QuizDTO quiz) {
		return quizService.createQuiz(quiz);
	}

	@GetMapping("/quizzes/{quizId}")
	public List<QuestionsDTO> getQuizById(@PathVariable Integer quizId) {
		return questionService.getQuizById(quizId);
	}

	@GetMapping("/quizzes")
	public List<QuizDTO> getAllQuizzes() {
		return quizService.getAllQuizzes();
	}

	@PutMapping("/quizzes/{quizId}")
	public QuizDTO updateQuiz(@PathVariable Long quizId, @RequestBody QuizDTO quiz) {
		return quizService.updateQuiz(quizId, quiz);
	}

	@DeleteMapping("/quizzes/{quizId}")
	public void deleteQuiz(@PathVariable Long quizId) {
		quizService.deleteQuiz(quizId);
	}

	// Questions API Endpoints

	@PostMapping("/createQuestions")
	public Boolean createQuestion(@RequestBody List<QuestionsDTO> questionsDTOSs) {
		return questionService.createQuestions(questionsDTOSs);
	}

	@GetMapping("/questions/{questionId}")
	public QuestionsDTO getQuestionById(@PathVariable Long questionId) {
		return questionService.getQuestionById(questionId);
	}

	// Users API Endpoints

	@PostMapping("/users")
	public UserDTO createUser(@RequestBody UserDTO user) {
		return userService.createUser(user);
	}

	@GetMapping("/users/{userId}")
	public UserDTO getUserById(@PathVariable String userId) {
		return userService.getUserById(userId);
	}

	// User Responses API Endpoints

	@PostMapping("/user-responses")
	public UserResponseDTO submitUserResponse(@RequestBody UserResponseDTO userResponse) {
		return userResponseService.submitUserResponse(userResponse);
	}

	@GetMapping("/user-responses/{responseId}")
	public UserResponseDTO getUserResponseById(@PathVariable Long responseId) {
		return userResponseService.getUserResponseById(responseId);
	}
}
