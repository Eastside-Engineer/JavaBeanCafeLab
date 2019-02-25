package co.grandcircus.javaBeansLab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Entity
public class users {
	
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long iduser;
		private String username;
		private String password;
		
		public users() {}

		public users(Long iduser, String username, String password) {
			super();
			this.iduser = iduser;
			this.username = username;
			this.password = password;
		}
		public Long getIdUser() {
			return iduser;
		}

		public void setIdUser(Long iduser) {
			this.iduser = iduser;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "users [iduser=" + iduser + ", username=" + username + ", password=" + password + "]";
		}
		
		
}

