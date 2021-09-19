package com.amdocs.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {

	@Column(name="user_id")
	private int userId;
	
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Phone_no")
	private String phone;
	
	@Column(name="Messege")
	private String message;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contactId;
	
	public Contact() {}

	public Contact(int userId, String name, String email, String phone, String message, int contactId) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
		this.contactId = contactId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	
	
	
}
