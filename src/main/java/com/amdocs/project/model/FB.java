package com.amdocs.project.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="feedback")
public class FB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int f_id;
	
	private int user_id;
	
	private String name;
	
	private String email;
	
	private String feedback;
	
	public FB(){}

	public FB(int f_id, int user_id, String name, String email, String feedback) {
		super();
		this.f_id = f_id;
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	
	
	
}
