package com.dixitpatelfullstack.quizapplication.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dixitpatelfullstack.quizapplication.Model.CreateQuizWrapper;
import com.dixitpatelfullstack.quizapplication.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	
	@PostMapping("create")
	public String createQuiz(@RequestBody CreateQuizWrapper quizWrapper){
		System.out.println(quizWrapper.getTopic() + " " + quizWrapper.getTitle() + " " + quizWrapper.getDifficultyLevel() + " " + quizWrapper.getNumOfQuestions());
		quizService.createQuiz(quizWrapper.getTopic(), quizWrapper.getTitle(), quizWrapper.getDifficultyLevel(), quizWrapper.getNumOfQuestions());
		return "Quiz Created";
	}
	
	
}
