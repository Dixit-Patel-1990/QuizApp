package com.dixitpatelfullstack.quizapplication.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dixitpatelfullstack.quizapplication.Model.Quiz;

public interface QuizDAO extends JpaRepository<Quiz, Integer> {

}
