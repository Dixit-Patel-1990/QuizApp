package com.dixitpatelfullstack.quizapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dixitpatelfullstack.quizapplication.DAO.QuestionDAO;
import com.dixitpatelfullstack.quizapplication.DAO.QuizDAO;
import com.dixitpatelfullstack.quizapplication.Model.Questions;
import com.dixitpatelfullstack.quizapplication.Model.Quiz;

@Service
public class QuizService {
	
	@Autowired
	QuizDAO quizDAO;
	
	@Autowired
	QuestionDAO questionDAO;

	public void createQuiz(String topic, String title, String difficultyLevel, Integer numOfQuestions) {
		
		List<Questions> questionsList = questionDAO.findRandomQuestionsByParameters(topic, numOfQuestions);
		Quiz quiz = new Quiz();
		quiz.setDifficultyLevel(difficultyLevel);
		quiz.setTitle(title);
		quiz.setTopic(topic);
		quiz.setNumOfQuestions(numOfQuestions);
		quiz.setQuestion(questionsList);
		quizDAO.save(quiz);
	}

	
}
