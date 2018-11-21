package br.ufg.inf.invscp.api.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import br.ufg.inf.invscp.api.enums.ProfileEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Necessário Email")
	@Email(message = "Email inválido")
	private String email;
	
	@NotBlank(message = "Senha necessária")
	@Size(min = 6)
	private String senha;
	
	@NotBlank(message = "Nome necessário")
	private String nome;
	
//	@NotBlank(message = "Tipo de usuário necessário")
	@Enumerated(EnumType.STRING)
	private ProfileEnum profile;
	
	public User() {
		this.profile = ProfileEnum.GERAL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}
	
}
