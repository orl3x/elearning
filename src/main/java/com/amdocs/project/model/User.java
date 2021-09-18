package com.amdocs.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user1")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	private String name;
	
	private String phone_no;
	
	private String email;
	
	private String address;
	
	private String reg_date;
	
	private String password;
	
	private String upload_photo;
	
	public User() {}
	



	public User(int user_id, String name, String phone_no, String email, String address, String reg_date,
			String password, String upload_photo) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.address = address;
		this.reg_date = reg_date;
		this.password = password;
		this.upload_photo = upload_photo;
	}
	
	




	public int getId() {
		return user_id;
	}


	public void setId(int id) {
		this.user_id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone_no;
	}


	public void setPhone(String phone) {
		this.phone_no = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDate() {
		return reg_date;
	}


	public void setDate(String date) {
		this.reg_date = date;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoto() {
		return upload_photo;
	}


	public void setPhoto(String photo) {
		this.upload_photo = photo;
	}
	
	
	
	
}
