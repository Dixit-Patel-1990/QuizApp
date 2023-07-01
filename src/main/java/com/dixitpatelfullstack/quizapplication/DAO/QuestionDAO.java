package com.dixitpatelfullstack.quizapplication.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dixitpatelfullstack.quizapplication.Model.Questions;


public interface QuestionDAO extends JpaRepository<Questions, Integer>{

}
