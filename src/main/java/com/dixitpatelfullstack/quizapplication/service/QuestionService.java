package com.dixitpatelfullstack.quizapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dixitpatelfullstack.quizapplication.DAO.QuestionDAO;
import com.dixitpatelfullstack.quizapplication.Model.QuestionId;
import com.dixitpatelfullstack.quizapplication.Model.Questions;


@Service
public class QuestionService {
	
	@Autowired
	QuestionDAO questionDAO;

	public List<Questions> getAllQuestions() {	
		return questionDAO.findAll();
	}

	public List<Questions> getQuestionsByTopic(String topic) {
		return questionDAO.findByTopic(topic);
	}

	public void addQuestion(Questions question) {
		questionDAO.save(question);
	}

	public void updateQuestion(Questions question) {
		questionDAO.save(question);	
	}

	public void deleteQuestion(QuestionId questionId) {
		questionDAO.deleteById(questionId.getQuestion_id());
	}
	

}
