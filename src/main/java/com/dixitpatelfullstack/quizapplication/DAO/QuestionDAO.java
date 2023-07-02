package com.dixitpatelfullstack.quizapplication.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dixitpatelfullstack.quizapplication.Model.Questions;


public interface QuestionDAO extends JpaRepository<Questions, Integer>{

	List<Questions> findByTopic(String topic);

	@Query(value = "Select * from questions q where q.topic =:topic ORDER BY RANDOM() LIMIT :numOfQuestions", nativeQuery = true)
	List<Questions> findRandomQuestionsByParameters(String topic, Integer numOfQuestions);

}
