package ar.edu.unlp.pasae.pasaepractica.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	public String username;

	@NotNull
	private String email;

	@NotNull
	public String authorities;

	public String getAuthorities() {
		return authorities;
	}

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
