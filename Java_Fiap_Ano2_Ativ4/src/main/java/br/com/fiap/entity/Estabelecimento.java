package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "tbl_estabelecimento")
public class Estabelecimento {
	@Id
	@SequenceGenerator(name = "estabelecimento", sequenceName = "sq_tbl_estabelecimento", allocationSize =1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "estabelecimento")
	@Column(name = "id_estabelecimento")
	private Integer id;

	@Column(name = "nome_estabelecimento", length = 50)
	private String nome;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_criacao")
	private Calendar dataCriacao;

	@Formula("(select avg(a.nota)+1 from avaliacao a where a.id_estabelecimento = id_estabelecimento)")
	private Double mediaAvaliacoes;

	// construtores, getters e setters
	
	public Estabelecimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estabelecimento(Integer id, String nome, Calendar dataCriacao, Double mediaAvaliacoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.mediaAvaliacoes = mediaAvaliacoes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Double getMediaAvaliacoes() {
		return mediaAvaliacoes;
	}

	public void setMediaAvaliacoes(Double mediaAvaliacoes) {
		this.mediaAvaliacoes = mediaAvaliacoes;
	}


}