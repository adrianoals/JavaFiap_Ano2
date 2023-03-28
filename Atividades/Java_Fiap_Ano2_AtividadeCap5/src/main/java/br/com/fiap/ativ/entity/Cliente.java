package br.com.fiap.ativ.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	
    @Id
    @Column(name="cd_cliente")
	@SequenceGenerator(name="cliente", sequenceName ="sq_tb_cliente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    private Long id;
    
    @Column(name = "nm_cliente")
    private String nome;
    
    
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    
 // Construtores
    public Cliente() {
		super();
		
	}

	public Cliente(long id, String nome, List<Pedido> pedidos) {
	super();
	this.id = id;
	this.nome = nome;
	this.pedidos = pedidos;
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


	public List<Pedido> getPedidos() {
		return pedidos;
	}


	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
    
   
}
