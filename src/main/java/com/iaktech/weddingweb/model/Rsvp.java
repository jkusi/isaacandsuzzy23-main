package com.iaktech.weddingweb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@Entity
public class Rsvp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Size(min = 2, max = 250,message ="Please enter your full name" )
	private String name;
	@NotEmpty(message = "User's email cannot be empty.")
	@Email(message = "Please enter a valid e-mail address")
	private String contact;
	
	private int numberOfGuest;

	@Size(min = 0, max = 200, message 
		      = "Message must be not above 200 characters")
	private String message;

	@NotEmpty(message = "Enter code")
	private String rsvpCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getNumberOfGuest() {
		return numberOfGuest;
	}

	public void setNumberOfGuest(int numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRsvpCode() {
		return rsvpCode;
	}

	public void setRsvpCode(String rsvpCode) {
		this.rsvpCode = rsvpCode;
	}
	

}
