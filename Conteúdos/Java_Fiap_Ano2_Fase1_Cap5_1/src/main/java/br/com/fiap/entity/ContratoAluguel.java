package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_contrato_aluguel")
public class ContratoAluguel {
	
	
	@Id
	@Column(name="id_contrato")
	private int id;
	
	@Column(name="vl_aluguel")
	private float valor;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_Vencimento")
	private Calendar dataVencimento;

	@OneToOne
	@JoinColumn(name = "id_estabelecimento")
	private Estabelecimento estabelecimento;
	

	public ContratoAluguel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContratoAluguel(int id, float valor, Calendar dataVencimento, Estabelecimento estabelecimento) {
		super();
		this.id = id;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.estabelecimento = estabelecimento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public Calendar getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}


	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
}
