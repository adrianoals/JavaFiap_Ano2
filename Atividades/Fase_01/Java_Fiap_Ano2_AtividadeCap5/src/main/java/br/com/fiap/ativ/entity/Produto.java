package br.com.fiap.ativ.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
    @Id    
   	@SequenceGenerator(name="produto", sequenceName ="sq_tb_produto", allocationSize = 1)
   	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
    @Column(name = "id_produto")
    private Long id;
    
    @Column(name = "nm_produto")
    private String nome;
        

 // construtores

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	public Produto(Long id, String nome) {
	super();
	this.id = id;
	this.nome = nome;
	
	}
        
    // getters e setters

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
    
}