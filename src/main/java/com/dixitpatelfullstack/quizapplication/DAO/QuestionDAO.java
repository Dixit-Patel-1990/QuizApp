package com.dixitpatelfullstack.quizapplication.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dixitpatelfullstack.quizapplication.Model.Questions;


public interface QuestionDAO extends JpaRepository<Questions, Integer>{

	List<Questions> findByTopic(String topic);

}
