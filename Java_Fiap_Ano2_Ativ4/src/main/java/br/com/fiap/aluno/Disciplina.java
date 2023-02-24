package br.com.fiap.aluno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "tbl_disciplina")
public class Disciplina {
	
	@Id
	@SequenceGenerator(name="disciplina",sequenceName="sq_tbl_disciplina",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="disciplina")
	@Column(name = "cd_disciplina")
	private Integer id;
	
	@Column(name = "nm_disciplina", length = 50)
    private String nome;

	public Disciplina() {
		super();
		
	}

	public Disciplina(Integer id, String nome) {
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
