package com.dixitpatelfullstack.quizapplication.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer quiz_id;
	private Integer numOfQuestions;
	private String topic;
	private String title;
	private String difficultyLevel;
	
	@ManyToMany
	private List<Questions> question;
	
	
	public Integer getQuiz_id() {
		return quiz_id;
	}
	public void setQuiz_id(Integer quiz_id) {
		this.quiz_id = quiz_id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public List<Questions> getQuestion() {
		return question;
	}
	public void setQuestion(List<Questions> question) {
		this.question = question;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public Integer getNumOfQuestions() {
		return numOfQuestions;
	}
	public void setNumOfQuestions(Integer numOfQuestions) {
		this.numOfQuestions = numOfQuestions;
	}
	
	@Override
	public String toString() {
		return "Quiz [quiz_id=" + quiz_id + ", topic=" + topic + ", question=" + question + "]";
	}
	
	
}
