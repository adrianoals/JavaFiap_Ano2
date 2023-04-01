package br.com.fiap.aluno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_aluno")
public class Aluno {

	@Id
	@SequenceGenerator(name="aluno",sequenceName="sq_tbl_aluno",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aluno")
	@Column(name = "id_aluno")
	private Integer id;
	
	@Column(name = "nm_aluno", length = 50)
    private String nome;

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
	
}
