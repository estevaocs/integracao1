package br.ufg.inf.invscp.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.ufg.inf.invscp.api.enums.UnidadeEnum;

@Entity
public class Loc {
	
	@Id
	private String id;

	@NotBlank(message = "Necessário cidade")
	private String cidade;
	
	@NotBlank(message = "Necessário estado")
	private String estado;
	
	@NotBlank(message = "Necessário unidade administrativa")
	private UnidadeEnum unidadeAdminstraca;

	public Loc() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public UnidadeEnum getUnidadeAdm() {
		return unidadeAdminstraca;
	}

	public void setUnidadeAdm(UnidadeEnum unidadeAdm) {
		this.unidadeAdminstraca = unidadeAdm;
	}
	
}
