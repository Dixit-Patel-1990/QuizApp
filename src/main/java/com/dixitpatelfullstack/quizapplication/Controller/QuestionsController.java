package com.dixitpatelfullstack.quizapplication.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dixitpatelfullstack.quizapplication.Model.Questions;
import com.dixitpatelfullstack.quizapplication.service.QuestionService;


@RestController
//@RequestMapping("/question")
public class QuestionsController {
	
	@Autowired
	QuestionService questionService;

	@GetMapping("/question/allQuestions")
	public List<Questions> getAllQuestions() {

		return questionService.getAllQuestions();
	}
}
