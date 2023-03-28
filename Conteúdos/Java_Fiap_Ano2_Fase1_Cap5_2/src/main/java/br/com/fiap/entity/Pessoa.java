package br.com.fiap.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  //Tem os outros tipos de estrategia esse é o padrão.
@DiscriminatorColumn(name = "tipo")
public class Pessoa {

	@Id
	@SequenceGenerator(name = "pessoa", sequenceName = "sq_pessoa", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa")
	private int id;
	
	private String nome;
	//Getters and Setters

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
	
	
}
