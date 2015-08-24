package br.com.victorfreitas.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Pessoa(){
	
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "profissao")
	private String profissao;
	
	@Column(name = "dataNiver")
	private String dataNiver;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getDataNiver() {
		return dataNiver;
	}

	public void setDataNiver(String dataNiver) {
		this.dataNiver = dataNiver;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
