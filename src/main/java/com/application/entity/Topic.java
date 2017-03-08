package com.application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Topic {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String text;
	private String topicDate;
	
	private int numberOfReplies;

	@OneToMany(mappedBy = "topic")
	private List<Reply> reply;

	

	@ManyToOne
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTopicDate() {
		return topicDate;
	}

	public void setTopicDate(String topicDate) {
		this.topicDate = topicDate;
	}

	public List<Reply> getReply() {
		return reply;
	}

	public void setReply(List<Reply> reply) {
		this.reply = reply;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getNumberOfReplies() {
		return numberOfReplies;
	}

	public void setNumberOfReplies(int numberOfReplies) {
		this.numberOfReplies = numberOfReplies;
	}

	
	
}
