package com.dixitpatelfullstack.quizapplication.Model;

import org.springframework.stereotype.Component;

@Component
public class QuestionId {
	private Integer question_id;

	public Integer getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}
	
}
