package com.dixitpatelfullstack.quizapplication.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dixitpatelfullstack.quizapplication.Model.QuestionId;
import com.dixitpatelfullstack.quizapplication.Model.Questions;
import com.dixitpatelfullstack.quizapplication.service.QuestionService;


@RestController
@RequestMapping("/question")
public class QuestionsController {
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	QuestionId questionId;

	@GetMapping("allQuestions")
	public List<Questions> getAllQuestions() {
		return questionService.getAllQuestions();
	}
	
	@GetMapping("topic/{topic}")
	public List<Questions> getQuestionsByTopic(@PathVariable String topic){
//		System.out.println("Topic is " + topic);
		return questionService.getQuestionsByTopic(topic);
	} 
	
	@PostMapping("add")
	public String addQuestion(@RequestBody Questions question) {
		System.out.println("question is " + question);
		questionService.addQuestion(question);
		return "Question added to the list";
	}
	
	/*
	 * Please pass all the parameters from Question Model
	 */
	@PutMapping("update")
	public String updateQuestion(@RequestBody Questions question) {
		System.out.println("question is " + question);
		questionService.updateQuestion(question);
		return "Question Updated";
	}
	
	@DeleteMapping("delete")
	public String deleteQuestion(@RequestBody QuestionId questionId) {
		System.out.println("questionId is " + questionId);
		questionService.deleteQuestion(questionId);
		return "Question Deleted Successfully";
	}
}
