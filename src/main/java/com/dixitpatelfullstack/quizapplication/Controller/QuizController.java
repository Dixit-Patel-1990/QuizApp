package com.dixitpatelfullstack.quizapplication.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dixitpatelfullstack.quizapplication.Model.CreateQuizWrapper;
import com.dixitpatelfullstack.quizapplication.Model.GetQuestionsWrapperForGetQuiz;
import com.dixitpatelfullstack.quizapplication.Model.QuizIdWrapper;
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
	
	@GetMapping("get")
	public List<GetQuestionsWrapperForGetQuiz> getQuiz(@RequestBody QuizIdWrapper quizIdWrapper){
		return quizService.getQuiz(quizIdWrapper);	 
	}
	
	
}
