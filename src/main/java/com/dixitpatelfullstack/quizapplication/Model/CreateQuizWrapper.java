package com.dixitpatelfullstack.quizapplication.Model;

public class CreateQuizWrapper {

	private String topic;
	private String title;
	private String difficultyLevel;
	private Integer numOfQuestions;
	private Questions questions;
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
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
	public Questions getQuestions() {
		return questions;
	}
	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
}
