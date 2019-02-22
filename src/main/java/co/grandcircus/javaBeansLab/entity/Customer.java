package co.grandcircus.javaBeansLab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;


@Entity
public class Customer {

	// A simple class with getters and setters can be referred to as
	// - a Java Bean
	// - a POJO (plain old Java object)
	// - a DTO (data transfer object)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private String javaTaste;
	private String cup;
	
	public Customer() {}
	
	public Customer(Long id, String firstName, String lastName, String email, String password, String phoneNumber,
			String javaTaste, String cup) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.javaTaste = javaTaste;
		this.cup = cup;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getJavaTaste() {
		return javaTaste;
	}
	public void setJavaTaste(String javaTaste) {
		this.javaTaste = javaTaste;
	}
	public String getCup() {
		return cup;
	}
	public void setCup(String cup) {
		this.cup = cup;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + ", javaTaste=" + javaTaste + ", cup="
				+ cup + "]";
	}
	
	


}
