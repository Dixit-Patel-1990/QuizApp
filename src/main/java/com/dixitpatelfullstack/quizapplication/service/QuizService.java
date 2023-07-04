package com.dixitpatelfullstack.quizapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dixitpatelfullstack.quizapplication.DAO.QuestionDAO;
import com.dixitpatelfullstack.quizapplication.DAO.QuizDAO;
import com.dixitpatelfullstack.quizapplication.Model.GetQuestionsWrapperForGetQuiz;
import com.dixitpatelfullstack.quizapplication.Model.Questions;
import com.dixitpatelfullstack.quizapplication.Model.Quiz;
import com.dixitpatelfullstack.quizapplication.Model.QuizIdWrapper;

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

	public List<GetQuestionsWrapperForGetQuiz> getQuiz(QuizIdWrapper quizIdWrapper) {
		
		Optional<Quiz> quiz = quizDAO.findById(quizIdWrapper.getQuiz_id());
		
		List<Questions> questions = quiz.get().getQuestion();
		List<GetQuestionsWrapperForGetQuiz> quizQuestions = new ArrayList<>();
		for(Questions q : questions) {
			quizQuestions.add(new GetQuestionsWrapperForGetQuiz(q.getQuestion_id(), q.getTopic(), q.getQuestion(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4()));
		}
		
		return quizQuestions;
	}

	
}
