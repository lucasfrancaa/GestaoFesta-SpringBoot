package br.com.projeto.festa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String nome;
	@Column
	private Integer qtdacompanhantes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQtdacompanhantes() {
		return qtdacompanhantes;
	}
	public void setQtdacompanhantes(Integer qtdacompanhantes) {
		this.qtdacompanhantes = qtdacompanhantes;
	}
	
	
}
