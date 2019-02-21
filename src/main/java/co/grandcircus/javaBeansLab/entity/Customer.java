package co.grandcircus.javaBeansLab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="users")
public class Customer {

	// A simple class with getters and setters can be referred to as
	// - a Java Bean
	// - a POJO (plain old Java object)
	// - a DTO (data transfer object)
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private String firstName;
		private String lastName;
		private String email;
		private String phoneNumber;
		private String password;
		private String javaTaste;
		private String cup;
		
		
		public Customer(String firstName, String lastName, String email, String phoneNumber, String password,
				String javaTaste, String cup) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.password = password;
			this.javaTaste = javaTaste;
			this.cup = cup;
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


		public Customer() {
		}


		public Customer(String firstName, String lastName, String email, String phoneNumber, String password) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.password = password;
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


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		@Override
		public String toString() {
			return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
					+ phoneNumber + ", password=" + password + "]";
		}

}