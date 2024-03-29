package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
	
	@Id
	@SequenceGenerator(name="produto", sequenceName="sq_tb_produto", allocationSize = 1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator ="produto")
	@Column (name = "cd_produto")
	private int id;
	
	@Column(name = "nm_produto", nullable = false, length = 100 )
	private String nome;
	
	@Column (name = "vl_preco")
	private double preco;
	
	@Temporal (TemporalType.DATE)
	@Column (name = "dt_validade")
	private Calendar dataValidade;
	
	@Enumerated (EnumType.STRING)
	private Enum<?> Estado;
	
	@Column(name= "dt_cadastro")
	@CreationTimestamp
	private Calendar dataCadastro;
	
	@Column (name="dt_modificacao")
	@UpdateTimestamp
	private Calendar dataModificacao;
	
	
	@Formula("vl_preco * 0.9")
	private double precoDesconto;
	

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produto(int id, String nome, double preco, Calendar dataValidade, Enum<?> estado, Calendar dataCadastro,
			Calendar dataModificacao, double precoDesconto) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
		Estado = estado;
		this.dataCadastro = dataCadastro;
		this.dataModificacao = dataModificacao;
		this.precoDesconto = precoDesconto;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Calendar getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}


	public Enum<?> getEstado() {
		return Estado;
	}


	public void setEstado(Enum<?> estado) {
		Estado = estado;
	}


	public Calendar getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public Calendar getDataModificacao() {
		return dataModificacao;
	}


	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}


	public double getPrecoDesconto() {
		return precoDesconto;
	}


	public void setPrecoDesconto(double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

	
	
}
