package com.example.H2CURD2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Email
	@Size(max = 100)
	@Column(name = "email", length = 50)
	private String email;

	@NotNull
	@Size(min = 3, max = 20)
	@Column(name = "first_name", length = 20)
	private String firstName;

	@Size(min = 1, max = 20)
	@Column(name = "last_name", length = 20)
	private String lastName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
